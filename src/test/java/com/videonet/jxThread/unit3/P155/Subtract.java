package com.videonet.jxThread.unit3.P155;

/**
 * @author tangjinhui
 * @Description：
 * @date 2017/12/14
 */
public class Subtract {

    private String lock;

    public Subtract(String lock) {
        this.lock = lock;
    }

    public void subtract() {
        synchronized (lock) {
            while (ValueObject.list.size() == 0) {
                System.out.println("wait begin threadName:" + Thread.currentThread().getName());
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("wait end threadName:" + Thread.currentThread().getName());
            }

            ValueObject.list.remove(0);
            System.out.println("after "+Thread.currentThread().getName()+" remove list size=" + ValueObject.list.size());
        }
    }
}
