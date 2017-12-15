package com.videonet.jxThread.unit3.P197;

/**
 * @author tangjinhui
 * @Description：
 * @date 2017/12/14
 */
public class ThreadA extends Thread{

    private InheritableThreadLocalExt t1;

    public ThreadA(InheritableThreadLocalExt t1) {
        this.t1 = t1;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(" 在ThreadA线程中取值 ="+t1.get());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
}
}
