package com.videonet.jxThread.unit3.P158;

import java.util.HashMap;

/**
 * @author tangjinhui
 * @Description：
 * @date 2017/12/14
 */
public class TestMain {

    public static void main(String[] args) {

        C c = new C("a");
        P p = new P("a");

        Thread threadC = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    c.getValue();
                }
            }
        },"C");

        Thread threadP = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    p.setValue();
                }
            }
        },"P");

//        threadC.start();
//        threadP.start();

        ThreadLocal t =  new ThreadLocal();
        t.set("a");
        ThreadLocal t1 = new ThreadLocal();
        t1.set("a1");

        System.out.println(t.get());
        System.out.println(t1.get());

    }

}
