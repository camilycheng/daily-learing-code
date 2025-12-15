package com.cn.cly.day01;

import lombok.Data;

@Data
public class Person {
    private String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private Person(String name) {
        this.name = name;
    }
    public Person() {

    }
    public void show() {
        System.out.println("我是一个人");

    }
    private String showNation(String nation) {
        System.out.println("我是一个人nation"+nation);
        return nation;
    }

}
