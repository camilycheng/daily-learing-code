package com.cn.cly.tool;

import java.lang.annotation.*;

@Documented
@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface FieldAutoMapping {

    String method() default "";

    String type();

}
