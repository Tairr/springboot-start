package com.videonet.thread;

import com.videonet.thread.ThreadExtentClass.ThreadExtentClass;
import org.assertj.core.api.IntArrayAssert;

import java.util.HashMap;
import java.util.Map;

/**
 * @author tangjinhui
 * @date 2017/11/29
 */
public class TestThread {


    public static void main(String[] args) {

        ThreadExtentClass threadExtentClass = new ThreadExtentClass();
        threadExtentClass.setName("myThread");
        threadExtentClass.start();

        for (int i = 0; i < 10; i++) {
            int time = (int)(Math.random()*1000);
            try {
                Thread.sleep(time);
                System.out.println("run="+Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        System.out.println("main over");


    }

}
