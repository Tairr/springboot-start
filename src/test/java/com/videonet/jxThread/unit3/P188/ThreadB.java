package com.videonet.jxThread.unit3.P188;

/**
 * @author tangjinhui
 * @Description：
 * @date 2017/12/14
 */
public class ThreadB extends Thread {

    @Override
     public void run(){
        System.out.println(Thread.currentThread().getName());
        synchronized(this) {
            System.out.println(Thread.currentThread().getName() + " start run");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " end run");
        }
    }

}
