package com.videonet.jxThread.unit5.P254;

import java.util.Timer;

/**
 * @author tangjinhui
 * @Description：
 * @date 2017/12/14
 */
public class TestMain {

    public static void main(String[] args) throws InterruptedException {
        MyTask task = new MyTask();
        MyTask task1 = new MyTask();
        Timer timera = new Timer("a");
        Timer timerb = new Timer("b");

        timera.schedule(task,5000);
        timerb.schedule(task1,6000);

        Thread.sleep(10000);
        System.out.println("before cancel");
        task.cancel();
        System.out.println("after cancel");

    }
}
