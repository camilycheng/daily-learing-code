package com.cn.cly.thead.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName: LockTest
 * @Version: 1.0
 * jdk5.0 新增
 * synch 和lock的区别
 * 1.lock手动加锁 手动释放锁
 *
 */
class Window implements Runnable {
    private int tic = 100;
    private ReentrantLock lock = new ReentrantLock();//非公平锁

    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();
                if (tic > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "票" + tic);
                    tic--;
                } else {
                    break;
                }

            } finally {
                lock.unlock();
            }
        }
    }
}

public class LockTest {
    public static void main(String[] args) {
        Window window = new Window();
        Thread t1 = new Thread(window);
        Thread t2 = new Thread(window);
        Thread t3 = new Thread(window);
        t1.setName("188888");
        t2.setName("288888");
        t3.setName("388888");
        t1.start();
        t2.start();
        t3.start();

    }

}
