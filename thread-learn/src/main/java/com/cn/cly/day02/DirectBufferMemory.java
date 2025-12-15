package com.cn.cly.day02;

import java.nio.ByteBuffer;

public class DirectBufferMemory {
    public static void main(String[] args) {
        //NIO 对外内存
        System.out.println("Hello World"+(sun.misc.VM.maxDirectMemory()/1024/1024));
        //分配系统内存
        ByteBuffer  buffer = ByteBuffer.allocateDirect(1024*1024);//
    }
}
