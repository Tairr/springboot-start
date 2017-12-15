package com.videonet.jxThread.unit2.synchronizedBlockLockAll;

/**
 * @author tangjinhui
 * @date 2017/12/1
 */
public class MyObject {

    synchronized public void objectPrint(){
        try{
            System.out.println("objectPrint_____getLock time="+System.currentTimeMillis()+"  run ThreadName="+Thread.currentThread().getName());
            Thread.sleep(2000);
            System.out.println("objectPrint_____releaseLock time="+System.currentTimeMillis()+"  run ThreadName="+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
