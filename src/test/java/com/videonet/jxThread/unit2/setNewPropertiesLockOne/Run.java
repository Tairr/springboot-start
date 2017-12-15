package com.videonet.jxThread.unit2.setNewPropertiesLockOne;

/**
 * @author tangjinhui
 * @date 2017/12/1
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {

        UserInfo user = new UserInfo();
        UserInfo user2 = new UserInfo();
        Servix servix = new Servix();
        Servix servix2 = new Servix();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                servix.methodA(user);
            }
        });

        thread1.setName("A");
        thread1.start();
        thread1.sleep(50);

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                servix2.methodA(user2);
            }
        });
        thread2.setName("B");
        thread2.start();

    }

}
