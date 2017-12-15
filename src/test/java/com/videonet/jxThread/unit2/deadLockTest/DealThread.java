package com.videonet.jxThread.unit2.deadLockTest;

/**
 * @author tangjinhui
 * @date 2017/12/1
 */
public class DealThread implements Runnable {

    private String name;
    private Object lock1 = new Object();
    private Object lock2 = new Object();

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        if(name.equals("a")){
            synchronized (lock1){
                try{
                    System.out.println("name="+name);
                    Thread.sleep(3000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }

                synchronized (lock2){
                    System.out.println("按lock1->lock2顺序执行了");
                }
            }
        }

        if(name.equals("b")){
            synchronized (lock2){
                try{
                    System.out.println("name="+name);
                    Thread.sleep(3000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }

                synchronized (lock1){
                    System.out.println("按lock2->lock1顺序执行了");
                }
            }
        }

    }
}
