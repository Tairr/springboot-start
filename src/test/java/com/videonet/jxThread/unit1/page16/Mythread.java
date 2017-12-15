package com.videonet.jxThread.unit1.page16;

/**
 * @author tangjinhui
 * @date 2017/11/29
 */
public class Mythread extends Thread{

    public Mythread() {
        System.out.println("构造方法打印："+Thread.currentThread().getName());
    }

    @Override
    public void run() {
        super.run();
        System.out.println("run方法打印："+Thread.currentThread().getName());
    }
}
