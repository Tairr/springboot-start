package com.videonet.thread.JustTest;

import java.util.Random;

/**
 * @author tangjinhui
 * @date 2017/12/12
 */
public class TestCoffee {

    private Class[] types = {Latte.class,Cappuccino.class,Mocha.class};

    private Random random = new Random(47);

    private Coffee next(){
        try {
            return (Coffee) types[random.nextInt(types.length)].newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return  null;
    }

    public static void main(String[] args) {


    }

}
