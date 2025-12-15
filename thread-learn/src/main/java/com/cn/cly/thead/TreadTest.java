package com.cn.cly.thead;

/**
 * @ClassName: TreadTest
 * @Version: 1.0
 * yield() ：释放当前cpu的执行权；暂停当前正在执行的线程对象，并执行其他线程。yield()将导致线程从运行状态转到可运行状态，但有可能没有效果。
 * join(): 在线程a 中调用线程b的join(),此时线程a就进入阻塞状态，知道线程b完全执行完成以后，线程a才结束阻塞状态，继续执行。
 * stop():结束一个线程
 * sleep():
 * isAive():
 */
public class TreadTest {

    public static void main(String[] args) throws InterruptedException {
        MyTread myTread = new MyTread("cly");
        //myTread.run();
        myTread.setPriority(Thread.MAX_PRIORITY);
        myTread.start();//1.启动当前线程，2.调用单前线程的run()
       // myTread.join();
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+":hello");
        }

    }
}


class MyTread extends Thread{

    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println(getName()+":i");
        }
    }
   public MyTread(String name){
        super(name);
   }
}