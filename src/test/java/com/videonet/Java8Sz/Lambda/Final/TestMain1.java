package com.videonet.Java8Sz.Lambda.Final;

import com.videonet.Java8Sz.Lambda.Apple;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author tangjinhui
 * @Description：
 * @date 2017/12/26
 */
public class TestMain1 {

    public static void main(String[] args) {

        List<Apple> apples = new ArrayList<>();

        apples.sort(
                Comparator.comparing(Apple::getHeight)
                        .reversed()
                        .thenComparing(Apple::getColor));




        List<Apple> redApples = FilterUtil.filter(apples,(a)->a.getColor().equals("red"));



        List<Apple> notRedApple = FilterUtil.filter(apples,(a)->a.getColor().equals("red"));


    }

}
