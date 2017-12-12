package com.videonet.thread.unit2.synchronizedBlockLockAll;

/**
 * @author tangjinhui
 * @date 2017/12/1
 */
public class Service {

    public void testMethod1(MyObject object){
        synchronized (object){
            try{
                System.out.println("testMethod1_____getLock time="+System.currentTimeMillis()+"  run ThreadName="+Thread.currentThread().getName());
                Thread.sleep(2000);
                System.out.println("testMethod1_____releaseLock time="+System.currentTimeMillis()+"  run ThreadName="+Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
