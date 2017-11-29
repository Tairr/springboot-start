package com.videonet.thread.unit1.page23;

/**
 * @author tangjinhui
 * @date 2017/11/29
 */
public class Mythread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i <5000 ; i++) {
            System.out.println("i="+i);
        }
    }
}
