package com.videonet.jxThread.unit3.P155;

/**
 * @author tangjinhui
 * @Description：
 * @date 2017/12/14
 */
public class TestMain {

    public static void main(String[] args) throws InterruptedException {

        String lock = new String("aa");
        Add add = new Add(lock);
        Subtract subtract = new Subtract(lock);

        Thread subThread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                subtract.subtract();
            }
        },"subThread1");

        Thread subThread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                subtract.subtract();
            }
        },"subThread2");

        subThread1.start();
        subThread2.start();

        Thread.sleep(1000);

        Thread addThread = new Thread(new Runnable() {
            @Override
            public void run() {
                add.add();
            }
        },"addThread");
        addThread.start();
    }

}
