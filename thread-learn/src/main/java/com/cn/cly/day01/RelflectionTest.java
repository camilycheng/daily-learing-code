package com.cn.cly.day01;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.Charset;

import static java.nio.charset.StandardCharsets.UTF_8;

public class RelflectionTest {
    public void test1() {
        Person p1 = new Person("Tom", 11);
        p1.age = 10;
        System.out.println(p1.toString());
        p1.show();
        Charset charset = UTF_8;

        String content="{}";
        byte[] bytes = content.getBytes(charset);
        System.out.println(bytes);

    }

    public void test2() throws Exception {
        Class cla = Person.class;
        Constructor constructor = cla.getConstructor(String.class, int.class);

        Object obj = constructor.newInstance("Tom", 12);
        System.out.println(obj.toString());
        Field age = cla.getDeclaredField("age");
        age.set(obj, 10);
        System.out.println(obj.toString());

        Method method = cla.getDeclaredMethod("show");
        method.invoke(obj);

        System.out.println("***********");
        Constructor constructor2 = cla.getDeclaredConstructor(String.class);
        constructor2.setAccessible(true);
        Person p2 = (Person) constructor2.newInstance("Jerry");

        System.out.println(p2.toString());
        Field name = cla.getDeclaredField("name");
        name.setAccessible(true);
        name.set(p2,"HG");
        System.out.println(p2.toString());

        Method method2 = cla.getDeclaredMethod("showNation",String.class);
        method2.setAccessible(true);
        method2.invoke(p2,"中国");
        System.out.println(p2.toString());
    }
}
