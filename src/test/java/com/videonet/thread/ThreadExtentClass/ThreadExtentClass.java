package com.videonet.thread.ThreadExtentClass;

/**
 * @author tangjinhui
 * @date 2017/11/29
 */
public class ThreadExtentClass extends  Thread{

    @Override
    public void run(){
        try {
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("run=" + Thread.currentThread().getName());
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
