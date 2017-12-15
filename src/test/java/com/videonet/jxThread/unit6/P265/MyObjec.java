package com.videonet.jxThread.unit6.P265;

/**
 * @author tangjinhui
 * @Description：
 * @date 2017/12/14
 */
public class MyObjec {

    public static MyObjec object;

    public static MyObjec getInstance(){

        if(object == null){
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            object = new MyObjec();
        }
        return object;
    }

}
