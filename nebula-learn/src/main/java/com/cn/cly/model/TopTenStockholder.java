package com.cn.cly.model;

import com.cn.cly.tool.ClassAutoMapping;
import com.cn.cly.tool.FieldAutoMapping;
import lombok.Data;

import java.io.Serializable;

@Data
@ClassAutoMapping("top_ten_stockholder")
public class TopTenStockholder implements Serializable {
    /**
     * id vid
     */
    @FieldAutoMapping(method = "getId", type = "Long")
    private Long id;

    /**
     * 父级ID
     */
    @FieldAutoMapping(method = "getCcxCode", type = "String")
    private String ccxCode;/**
     * 名称
     */
    @FieldAutoMapping(method = "getStockholderName", type = "String")
    private String stockholderName;

    /**
     * 描述
     */
    @FieldAutoMapping(method = "getStockholderType", type = "String")
    private String stockholderType;


    @FieldAutoMapping(method = "getShareProportion", type = "String")
    private String shareProportion;

    @FieldAutoMapping(method = "getGdCcxCode", type = "String")
    private String gdCcxCode;

    @FieldAutoMapping(method = "getInputTime", type = "String")
    private String inputTime;

    @FieldAutoMapping(method = "getUpdateTime", type = "String")
    private String updateTime;
}
