package com.videonet.jxThread.unit3.P188;

/**
 * @author tangjinhui
 * @Description：
 * @date 2017/12/14
 */
public class TestMain {

    public static void main(String[] args) throws InterruptedException {

        ThreadB threadB = new ThreadB();
        ThreadA threadA = new ThreadA(threadB);

        threadA.setName("threadA");
        threadB.setName("threadB");


        threadA.start();
        threadB.start();
        synchronized (threadB){
            System.out.println("synchronized main before sleep");
            Thread.sleep(10000);
            System.out.println("synchronized main after sleep");
        }
        System.out.println("join before");
//        threadB.join(2000);
        System.out.println(Thread.currentThread().getName()+" end");

    }

}
