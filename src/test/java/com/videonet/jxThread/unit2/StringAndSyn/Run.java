package com.videonet.jxThread.unit2.StringAndSyn;

/**
 * @author tangjinhui
 * @date 2017/12/1
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        Service service2 = new Service();
//        ThreadA threadA = new ThreadA(service);
//        threadA.setName("A");
//        threadA.start();
//
//        ThreadB threadB = new ThreadB(service);
//        threadB.setName("B");
//        threadB.start();

        Integer a=1;
        Integer b=1;
        System.out.println(a==b);
        System.out.println(service==service2);

    }
}
