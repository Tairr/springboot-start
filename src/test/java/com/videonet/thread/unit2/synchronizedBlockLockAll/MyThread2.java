package com.videonet.thread.unit2.synchronizedBlockLockAll;

/**
 * @author tangjinhui
 * @date 2017/12/1
 */
public class MyThread2 extends Thread {
    private MyObject object;
    private Service service;

    public MyThread2(MyObject object, Service service) {
        super();
        this.object = object;
        this.service = service;
    }

    @Override
    public void run(){
        object.objectPrint();
    }

}
