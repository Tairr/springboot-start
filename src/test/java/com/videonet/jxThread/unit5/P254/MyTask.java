package com.videonet.jxThread.unit5.P254;

import java.util.TimerTask;

/**
 * @author tangjinhui
 * @Description：
 * @date 2017/12/14
 */
public class MyTask extends TimerTask {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" run mytask");
    }
}
