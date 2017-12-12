package com.videonet.thread.unit3.TwoThreadThransData;

/**
 * @author tangjinhui
 * @date 2017/12/4
 */
public class Test {

    public static void main(String[] args) {

        Mylist mylist = new Mylist();

        MyThreadA myThreadA = new MyThreadA(mylist);
        myThreadA.setName("A");
        myThreadA.start();

        MyThreadB myThreadB = new MyThreadB(mylist);
        myThreadB.setName("B");
        myThreadB.start();

    }

}
