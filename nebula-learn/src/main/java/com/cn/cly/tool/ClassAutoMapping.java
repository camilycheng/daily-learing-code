package com.cn.cly.tool;

import java.lang.annotation.*;

@Documented
@Target({ElementType.TYPE,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ClassAutoMapping {

    String value() default "";

}
