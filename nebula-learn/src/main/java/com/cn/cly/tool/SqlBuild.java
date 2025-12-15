package com.cn.cly.tool;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SqlBuild {
    private Long id;

    private String name;

    private String field;

    private String values;
}
