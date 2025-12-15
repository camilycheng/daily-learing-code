package com.cn.cly.model;

import com.cn.cly.tool.ClassAutoMapping;
import com.cn.cly.tool.FieldAutoMapping;
import lombok.Data;

import java.io.Serializable;

@Data
@ClassAutoMapping("modelandclass")
public class ModelAndClass  implements Serializable {
    /**
     * id vid
     */
    @FieldAutoMapping(method = "getId", type = "Long")
    private Long id;

    /**
     * 父级ID
     */
    @FieldAutoMapping(method = "getPid", type = "Long")
    private Long pid;/**
     * 名称
     */
    @FieldAutoMapping(method = "getName", type = "String")
    private String name;

    /**
     * 描述
     */
    @FieldAutoMapping(method = "getDescription", type = "String")
    private String description;

}
