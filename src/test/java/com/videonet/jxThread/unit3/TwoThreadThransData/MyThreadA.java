package com.videonet.jxThread.unit3.TwoThreadThransData;

/**
 * @author tangjinhui
 * @date 2017/12/4
 */
public class MyThreadA extends Thread{

    private Mylist mylist;

    public MyThreadA(Mylist mylist) {
        super();
        this.mylist = mylist;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            mylist.add();
            System.out.println("添加了"+(i+1)+"个元素");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
