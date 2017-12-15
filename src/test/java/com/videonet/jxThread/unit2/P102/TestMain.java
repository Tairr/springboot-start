package com.videonet.jxThread.unit2.P102;

/**
 * @author tangjinhui
 * @Description：
 * @date 2017/12/14
 */
public class TestMain {


    public static void main(String[] args) {

        service se = new service();
        service se1 = new service();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                se.print("AA");
            }
        },"A");

        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                se.print(new String("AA"));
            }
        },"B");
        thread2.start();
    }

}
