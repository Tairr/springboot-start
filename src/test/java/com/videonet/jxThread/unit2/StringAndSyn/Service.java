package com.videonet.jxThread.unit2.StringAndSyn;

/**
 * @author tangjinhui
 * @date 2017/12/1
 */
public class Service {

    public static void print(Integer param){
        synchronized (param){
            while (true){
                try {
                    System.out.println("time:"+System.currentTimeMillis()+" ,current jxThread:"+Thread.currentThread().getName());
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
