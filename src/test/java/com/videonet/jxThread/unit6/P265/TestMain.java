package com.videonet.jxThread.unit6.P265;

/**
 * @author tangjinhui
 * @Description：
 * @date 2017/12/14
 */
public class TestMain {

    public static void main(String[] args) throws InterruptedException {
        Thread a = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(MyObjec.getInstance().hashCode());
            }
        });
        Thread b = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(MyObjec.getInstance().hashCode());
            }
        });
        Thread c = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(MyObjec.getInstance().hashCode());
            }
        });
        a.start();
        b.start();
        c.start();



        System.out.println(MyObjec.object.hashCode());

    }



}
