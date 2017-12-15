package com.videonet.jxThread.unit3.P158;

/**
 * @author tangjinhui
 * @Description：生产者
 * @date 2017/12/14
 */
public class P {

    private String lock;

    public P(String lock) {
        this.lock = lock;
    }

    public void setValue(){

        synchronized (lock){
            if(!ValueObject.value.equals("")){
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            String value = System.currentTimeMillis()+"_"+System.nanoTime();
            ValueObject.value = value;
            System.out.println("P set的值是："+ValueObject.value);
            lock.notifyAll();
        }

    }
}
