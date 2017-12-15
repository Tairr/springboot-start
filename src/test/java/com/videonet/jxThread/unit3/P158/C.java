package com.videonet.jxThread.unit3.P158;

/**
 * @author tangjinhui
 * @Description：消费者
 * @date 2017/12/14
 */
public class C {

    private String lock;

    public C(String lock) {
        this.lock = lock;
    }

    public void getValue(){

        synchronized (lock){

            if(ValueObject.value.equals("")){
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("C get的值是："+ValueObject.value);
            ValueObject.value="";
            lock.notifyAll();

        }

    }
}
