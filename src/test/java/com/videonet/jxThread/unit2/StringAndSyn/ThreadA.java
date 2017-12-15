package com.videonet.jxThread.unit2.StringAndSyn;

/**
 * @author tangjinhui
 * @date 2017/12/1
 */
public class ThreadA extends Thread {

    private Service service;

    public ThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run(){
        service.print(2);
    }
}
