package com.cn.cly.tool;

import lombok.Data;
import java.util.List;

@Data
public class NebulaResult<T> {
    private Integer code;
    private String message;
    private List<T> data;

    public boolean isSuccessed(){
        return code == 0;
    }
}
