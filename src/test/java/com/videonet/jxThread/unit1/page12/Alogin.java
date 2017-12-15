package com.videonet.jxThread.unit1.page12;

/**
 * @author tangjinhui
 * @date 2017/11/29
 */
public class Alogin extends Thread{

    @Override
    public void run(){
        LoginServlet.doPost("a","aa");
    }
}
