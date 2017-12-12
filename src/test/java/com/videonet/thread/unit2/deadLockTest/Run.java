package com.videonet.thread.unit2.deadLockTest;

import com.videonet.thread.unit2.StringAndSyn.ThreadB;

/**
 * @author tangjinhui
 * @date 2017/12/1
 */
public class Run {

    public static void main(String[] args) {

        try {

            DealThread t1 = new DealThread();
            t1.setName("a");
            Thread thread1 = new Thread(t1);
            thread1.start();
            thread1.sleep(100);

            t1.setName("b");
            Thread thread2 = new Thread(t1);
            thread2.start();

        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }

}
