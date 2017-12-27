package com.videonet.szThread.P33;

/**
 * @author tangjinhui
 * @Description：
 * @date 2017/12/18
 */
public class TestMain {

    public static void main(String[] args) {

        TestClass t = new TestClass();
        String[] strs = t.getStrs();
        strs =new String[] {"2","1","22222"};
        System.out.println(t.getStrs());
    }

}
