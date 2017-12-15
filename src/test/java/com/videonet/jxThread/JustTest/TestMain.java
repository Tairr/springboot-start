package com.videonet.jxThread.JustTest;

/**
 * @author tangjinhui
 * @date 2017/12/12
 */
public class TestMain {

    public static void main(String[] args) {
        TestClass a = new TestClass();
        a.set("aa");
        System.out.println(a.get());
    }

    public TestClass next(){
        try {
            return  (TestClass)TestClass.class.newInstance();
        }catch (Exception e){

        }
        return  null;
    }
}
