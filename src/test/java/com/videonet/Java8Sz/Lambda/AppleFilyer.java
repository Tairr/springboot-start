package com.videonet.Java8Sz.Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author tangjinhui
 * @Description：
 * @date 2017/12/22
 */
public class AppleFilyer {

    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();
//        List<Apple> apples = inventory.stream().filter((Apple a)->a.getHeight()>150).;

        Comparator<Apple> c =
                (Apple a1, Apple a2) -> a1.getHeight().compareTo(a2.getHeight());


        Apple a3 = new Apple();
        Apple a4 = new Apple();

        System.out.println(c.getClass());;

    }

}
