package com.videonet.Java8Sz.Lambda.U1343;

import java.util.function.Function;

/**
 * @author tangjinhui
 * @Description：
 * @date 2017/12/26
 */
public class FunctionTest {



    public static void main(String[] args) {



        Function f = new Function() {

            @Override
            public Object apply(Object o) {
                return null;
            }
        };

        Runnable r = () -> {
            System.out.println("test Lambda");
        };


//        TriFunction<Integer,Integer,Integer,Integer> color =

    }

}
