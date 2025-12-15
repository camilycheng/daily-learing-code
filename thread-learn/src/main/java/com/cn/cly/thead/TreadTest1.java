package com.cn.cly.thead;

/**
 * @ClassName: TreadTest
 * @Version: 1.0
 */
public class TreadTest1 {

    public static void main(String[] args) {
      new Thread(){
          @Override
          public void run() {
              System.out.println("22222");
          }
      }.start();

        new Thread(){
            @Override
            public void run() {
              System.out.println("11111");
            }
        }.start();
    }
}
