package com.cn.cly.tool;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.cn.cly.config.NebulaConstant;
import com.vesoft.nebula.client.graph.net.Session;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.*;
import java.util.stream.Collectors;

@Slf4j
@Component
public class NebulaTemplate {
    @Resource
    Session session;


    public <T> NebulaResult<T> queryObject(String stmt, Class<T> tClass) {
        NebulaResult<T> nebulaResult = executeObject(stmt);
        if (Objects.isNull(nebulaResult.getData())) {
            return nebulaResult;
        }
        Optional.ofNullable(nebulaResult.getData()).ifPresent(data -> nebulaResult.setData(data.stream().map(d -> JSONObject.toJavaObject(((JSONObject) d), tClass)).collect(Collectors.toList())));
        return nebulaResult;
    }

    public NebulaResult executeObject(String stmt) {
        JSONObject jsonObject = executeJson(stmt);
        return JSONObject.toJavaObject(jsonObject, NebulaResult.class);
    }

    public JSONObject executeJson(String stmt) {
        JSONObject restJson = new JSONObject();
        try {
            JSONObject jsonObject = JSON.parseObject(Objects.requireNonNull(session).executeJson(stmt));
            JSONObject errors = jsonObject.getJSONArray(NebulaConstant.NebulaJson.ERRORS.getKey()).getJSONObject(0);
            restJson.put(NebulaConstant.NebulaJson.CODE.getKey(), errors.getInteger(NebulaConstant.NebulaJson.CODE.getKey()));
            if (errors.getInteger(NebulaConstant.NebulaJson.CODE.getKey()) != 0) {
                restJson.put(NebulaConstant.NebulaJson.MESSAGE.getKey(), errors.getString(NebulaConstant.NebulaJson.MESSAGE.getKey()));
                return restJson;
            }
            JSONObject results = jsonObject.getJSONArray(NebulaConstant.NebulaJson.RESULTS.getKey()).getJSONObject(0);
            JSONArray columns = results.getJSONArray(NebulaConstant.NebulaJson.COLUMNS.getKey());
            if (Objects.isNull(columns)) {
                return restJson;
            }
            JSONArray data = results.getJSONArray(NebulaConstant.NebulaJson.DATA.getKey());
            if (Objects.isNull(data)) {
                return restJson;
            }
            List<JSONObject> resultList = new ArrayList<>();
            data.stream().map(d -> (JSONObject) d).forEach(d -> {
                JSONArray row = d.getJSONArray(NebulaConstant.NebulaJson.ROW.getKey());
                JSONObject map = new JSONObject();
                for (int i = 0; i < columns.size(); i++) {
                    map.put(columns.getString(i), row.get(i));
                }
                resultList.add(map);
            });
            restJson.put(NebulaConstant.NebulaJson.DATA.getKey(), resultList);
        } catch (Exception e) {
            restJson.put(NebulaConstant.NebulaJson.CODE.getKey(), NebulaConstant.ERROR_CODE);
            restJson.put(NebulaConstant.NebulaJson.MESSAGE.getKey(), e.toString());
            log.error("nebula execute err：", e);
        }
        return restJson;
    }
}
