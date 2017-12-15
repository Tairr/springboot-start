package com.videonet.jxThread.unit3.P188;

/**
 * @author tangjinhui
 * @Description：
 * @date 2017/12/14
 */
public class ThreadA extends Thread {

    private ThreadB threadB;

    public ThreadA(ThreadB threadB) {
        this.threadB = threadB;
    }

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());

        synchronized (threadB){
            System.out.println(Thread.currentThread().getName()+" start run");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName()+" end  run");
        }
    }
}
