package com.videonet.thread.unit3.TwoThreadThransData;

/**
 * @author tangjinhui
 * @date 2017/12/4
 */
public class MyThreadB extends Thread {

    private Mylist mylist;

    public MyThreadB(Mylist mylist) {
        super();
        this.mylist = mylist;
    }

    @Override
    public void run() {
        while (true){
          //  System.out.println("mylist元素个数："+mylist.size());
            if(mylist.size()==5) {
                System.out.println("==5了，线程b要退出了");
                try {
                    throw new InterruptedException();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
