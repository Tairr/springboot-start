package com.videonet.jxThread.unit4.P210;

/**
 * @author tangjinhui
 * @Description：
 * @date 2017/12/15
 */
public class ThreadA extends Thread {

    private MyService service;

    public ThreadA(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.awaitA();
    }
}
