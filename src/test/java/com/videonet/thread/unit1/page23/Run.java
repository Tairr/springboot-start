package com.videonet.thread.unit1.page23;

/**
 * @author tangjinhui
 * @date 2017/11/29
 */
public class Run {
    public static void main(String[] args) {
        Mythread mythread = new Mythread();
        mythread.start();
        try {
            mythread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
     //   mythread.interrupt();
    }
}
