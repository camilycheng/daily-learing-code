package com.cn.cly.day02;

public class StackOverFlowError {
    public static void main(String[] args) {
        stackOverFlowError();

    }

    private static void stackOverFlowError() {
        stackOverFlowError();
    }
}
