package com.cn.cly;

import java.awt.font.LineBreakMeasurer;

/**
 * @ClassName: TreadTest
 * @Version: 1.0
 * yield() ：释放当前cpu的执行权；暂停当前正在执行的线程对象，并执行其他线程。yield()将导致线程从运行状态转到可运行状态，但有可能没有效果。
 * join(): 在线程a 中调用线程b的join(),此时线程a就进入阻塞状态，知道线程b完全执行完成以后，线程a才结束阻塞状态，继续执行。
 * stop():结束一个线程
 * sleep():
 * isAive():
 */
public class TreadTest4 {

    public static void main(String[] args) throws InterruptedException {
        MyTread4 myTread1 = new MyTread4("cly");
        //myTread.run();
        // myTread1.setPriority(Thread.MAX_PRIORITY);
        myTread1.start();//1.启动当前线程，2.调用单前线程的run()

        MyTread4 myTread2 = new MyTread4("cly2");
        myTread2.start();
        // myTread.join();
//        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
//        for(int i=0;i<10;i++){
//            System.out.println(Thread.currentThread().getName()+":hello");
//        }

    }
}


class MyTread4 extends Thread {
    private static int tic = 100;
    private static Object object = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (object) {
                if (tic > 0) {
                    System.out.println(getName() + ":hello,*****" + tic);
                    tic--;
                } else {
                    break;
                }
            }
        }
    }

    public MyTread4(String name) {
        super(name);
    }
}