package com.videonet.thread.unit2.synchronizedBlockLockAll;

/**
 * @author tangjinhui
 * @date 2017/12/1
 */
public class MyThread1 extends Thread{

    private MyObject object;
    private Service service;

    public MyThread1(MyObject object, Service service) {
        super();
        this.object = object;
        this.service = service;
    }

    @Override
    public void run(){
        service.testMethod1(object);
    }
}
