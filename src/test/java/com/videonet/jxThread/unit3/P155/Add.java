package com.videonet.jxThread.unit3.P155;

/**
 * @author tangjinhui
 * @Description：
 * @date 2017/12/14
 */
public class Add {

    private String lock;

    public Add(String lock) {
        this.lock = lock;
    }

    public void add(){
        synchronized (lock){
            ValueObject.list.add("anyString");
            lock.notifyAll();
        }
    }
}
