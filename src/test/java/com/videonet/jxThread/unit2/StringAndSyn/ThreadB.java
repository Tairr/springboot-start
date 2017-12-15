package com.videonet.jxThread.unit2.StringAndSyn;

/**
 * @author tangjinhui
 * @date 2017/12/1
 */
public class ThreadB extends Thread {

    private Service service;

    public ThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run(){
        service.print(2);
    }
}
