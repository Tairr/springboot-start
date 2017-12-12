package com.videonet.thread.unit2.synchronizedBlockLockAll;

/**
 * @author tangjinhui
 * @date 2017/12/1
 */
public class Run {
    public static void main(String[] args) {
        MyObject object = new MyObject();
        Service service = new Service();
        MyThread1 thread1 = new MyThread1(object,service);
        thread1.setName("A");
        thread1.start();
        MyThread2 thread2 = new MyThread2(object,service);
        thread2.setName("B");
        thread2.start();

    }
}
