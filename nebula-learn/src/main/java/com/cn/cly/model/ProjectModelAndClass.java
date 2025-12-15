package com.cn.cly.model;

import com.cn.cly.tool.ClassAutoMapping;
import com.cn.cly.tool.FieldAutoMapping;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ClassAutoMapping("project_attributeandrelationship")
public class ProjectModelAndClass extends Edge implements Serializable {

    @FieldAutoMapping(method = "getStartId",type = "Long")
    private Long startId;

    @FieldAutoMapping(method = "getEndId",type = "Long")
    private Long endId;

}
