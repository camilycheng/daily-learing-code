package com.cn.cly.day02;

import java.util.ArrayList;
import java.util.List;

public class GcOverheadTeat {
    // -Xms10m -Xmx10m -XX:+PrintGCDetails -XX:MaxDirectMemorySize=5m
    public static void main(String[] args) {
        int i = 0;
        List<String> list = new ArrayList<>();
        try {
            while (true) {
                list.add(String.valueOf(i++).intern());

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
