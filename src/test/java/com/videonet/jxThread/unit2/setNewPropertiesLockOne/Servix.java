package com.videonet.jxThread.unit2.setNewPropertiesLockOne;

/**
 * @author tangjinhui
 * @date 2017/12/1
 */
public class Servix {

    public void methodA(UserInfo userInfo){

        synchronized (userInfo){

            System.out.println("jxThread name:"+Thread.currentThread().getName());
            userInfo.setName("change name");
            try {
                Thread.sleep(3000);
                System.out.println("end ! time:"+System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
