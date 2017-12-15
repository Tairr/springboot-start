package com.videonet.jxThread.unit3.P197;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author tangjinhui
 * @Description：
 * @date 2017/12/14
 */
public class TestMain {

    public static void main(String[] args) throws InterruptedException {

        InheritableThreadLocalExt t1 = new InheritableThreadLocalExt();

        for (int i = 0; i < 10; i++) {
            System.out.println("在main线程中取值 ="+t1.get());
            Thread.sleep(100);
        }
        ThreadA.sleep(5000);
        ThreadA threadA = new ThreadA(t1);
        threadA.start();
    }

}
