package com.cn.cly.thead;

/**
 * @ClassName: RunableThreadTeat
 * @Version: 1.0
 */
public class RunableThreadTest {

    public static void main(String[] args){

        PrimeRunable primeRunable =  new RunableThreadTest().new PrimeRunable();
        Thread t1=new Thread(primeRunable);
        Thread t2=new Thread(primeRunable);
        Thread t3=new Thread(primeRunable);
        t1.start();
        t2.start();
        t3.start();
    }



class PrimeRunable implements Runnable {
    private int ticket = 100;
    @Override
    public void run() {

        while (true){
            if(ticket>0){
                System.out.println(Thread.currentThread().getName()+":"+ticket);
                ticket--;
            }else{
                break;
            }
        }
//        for(int i=0;i<100;i++){
//            if(i%2==0){
//                System.out.println(Thread.currentThread().getName()+":"+i);
//            }
//
//        }
    }
}

}