package com.cn.cly.day03;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueDemo {

    public static void main(String[] args) {
        BlockingQueue<String> queue=new ArrayBlockingQueue<>(3);
        System.out.println(queue.add("a"));
        System.out.println(queue.add("b"));
        System.out.println(queue.add("c"));
       // System.out.println(queue.add("d"));//java.lang.IllegalStateException: Queue full

        System.out.println(queue.element());//查询对首元素

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
       // System.out.println(queue.remove()); //java.util.NoSuchElementException

        //queue.offer()


    }
}
