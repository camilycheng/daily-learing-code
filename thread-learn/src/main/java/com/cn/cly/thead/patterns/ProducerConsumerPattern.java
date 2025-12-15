package com.cn.cly.thead.patterns;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerPattern<T> {
    private Queue<T> queue=new LinkedList<>();
    private  int capacity;
    public ProducerConsumerPattern(int capacity) {
        this.capacity = capacity;
    }

    public synchronized  void put(T t) throws InterruptedException {
        while(queue.size()>=capacity){
            wait();
        }
        queue.add(t);
        notifyAll();
    }

    public synchronized T take() throws InterruptedException {
        while(queue.isEmpty()||queue.size()==0){
            wait();
        }
       T item= queue.remove();
        notifyAll();
        return item;
    }


}
