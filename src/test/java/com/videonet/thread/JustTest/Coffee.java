package com.videonet.thread.JustTest;

/**
 * @author tangjinhui
 * @date 2017/12/12
 */
public class Coffee {

    private static long counter = 0;
    private final long id = counter++;

    public String toString(){
        return getClass().getSimpleName()+" "+id;
    }

}
