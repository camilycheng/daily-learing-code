package com.cn.cly.controller;

import com.cn.cly.tool.NebulaResult;
import com.cn.cly.tool.NebulaTemplate;
import com.vesoft.nebula.client.graph.exception.IOErrorException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {

    @Resource
    NebulaTemplate nebulaTemplate;

    @GetMapping("/addVertex")
    public Object addJSON() throws IOErrorException {
        String sql = "insert vertex team(team_name, persion_num) values \"team_2\":(\"team_2\", 43);";
        NebulaResult nebulaResult = nebulaTemplate.executeObject(sql);
        return nebulaResult;
    }

    @GetMapping("/findVertex")
    public Object findJson2() throws IOErrorException {
        String sql = "lookup on team  yield id(vertex) AS id,properties(vertex).persion_num AS persion_num,properties(vertex).team_name AS team_name;";
        //NebulaResult<Info> infoNebulaResult = nebulaTemplate.queryObject(sql, Info.class);
        return null; //infoNebulaResult;
    }
}
