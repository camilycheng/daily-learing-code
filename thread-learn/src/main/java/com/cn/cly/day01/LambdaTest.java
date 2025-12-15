package com.cn.cly.day01;

import java.util.Comparator;

public class LambdaTest {

     public static void main(String[] args) throws InterruptedException {

         Runnable runnable = new Runnable() {
             public void run() {
                 System.out.println("hello");
             }
         };
         runnable.run();
         System.out.println("hello");
         Runnable runnable1 = () -> System.out.println("hello 2");
         runnable1.run();


         Comparator<Integer> comparable=(o1, o2)->Integer.compare(o1,o2);
        int i= comparable.compare(1,2);
        System.out.println(i);

        Comparator<Integer> comparabl2=Integer::compare;

        Thread.sleep(Integer.MAX_VALUE);
     }
}
