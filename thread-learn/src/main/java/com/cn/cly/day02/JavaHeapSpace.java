package com.cn.cly.day02;

import java.util.Random;

public class JavaHeapSpace {
    public static void main(String[] args) {

        //byte[] byteArray2 = new byte[80*1024*1024];
        String str="wer";
        while(true){
            str=str +new Random().nextInt(111111111)+new Random().nextInt(111111111)+new Random().nextInt(111111111);
            str.intern();
        }
    }
}
