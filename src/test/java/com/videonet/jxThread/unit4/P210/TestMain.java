package com.videonet.jxThread.unit4.P210;

/**
 * @author tangjinhui
 * @Description：
 * @date 2017/12/15
 */
public class TestMain {

    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        MyService service1 = new MyService();
        ThreadA a = new ThreadA(service);
        ThreadB b = new ThreadB(service);
        a.setName("a");
        b.setName("b");
        a.start();
        //b.start();

        //Thread.sleep(3000);
        //service.signalAll_A();

    }
}
