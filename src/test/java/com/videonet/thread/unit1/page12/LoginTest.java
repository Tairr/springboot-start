package com.videonet.thread.unit1.page12;

/**
 * @author tangjinhui
 * @date 2017/11/29
 */
public class LoginTest {

    public static void main(String[] args) {
/*
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                LoginServlet.doPost("a","aa");
            }
        });
        thread.start();

        Thread bthread =  new Thread(new Runnable() {
            @Override
            public void run() {
                LoginServlet.doPost("b","bb");
            }
        });
        bthread.start();*/

        Alogin alogin = new Alogin();
        alogin.start();

        Blogin blogin = new Blogin();
        blogin.start();

    }

}
