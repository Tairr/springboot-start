package com.videonet.jxThread.unit2.P102;

/**
 * @author tangjinhui
 * @Description：
 * @date 2017/12/14
 */
public class service {
    public void print(String param){
        synchronized (param){
            while (true) {
                try {
                    System.out.println("Thread name:"+Thread.currentThread().getName());
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
