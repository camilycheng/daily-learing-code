package com.cn.cly;

import sun.applet.Main;

import java.util.concurrent.*;

/**
 * @ClassName: CallThread
 * @Version: 1.0
 */
 class CallThreadSub implements Callable {
    @Override
    public Object call() throws Exception {
        int sum=0;
        for(int i=0;i<=100;i++){
            sum+=i;
        }
        return sum;
    }
}


public class CallThread{

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallThreadSub test=new CallThreadSub();
        FutureTask task =  new FutureTask(test);
        new Thread(task).start();
        System.out.println(task.get());
    }
}