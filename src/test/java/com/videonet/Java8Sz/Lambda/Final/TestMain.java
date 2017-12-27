package com.videonet.Java8Sz.Lambda.Final;

import com.videonet.Java8Sz.Lambda.Apple;
import org.apache.commons.io.FileUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

import static java.util.Comparator.comparing;

/**
 * @author tangjinhui
 * @Description：
 * @date 2017/12/22
 */
public class TestMain {

    public static void main(String[] args) {

        List<Apple> a= new ArrayList<>();

        List<Apple> filterGreen = FilterUtil.filter(a,(a1)->a1.getColor().equals("green"));

        List<Apple> filterGreen11 = FilterUtil.filter(a,(a1)->true);

        List<Apple> filterGreen1= FilterUtil.filter(a, new Predicate<Apple>() {

            @Override
            public boolean test(Apple apple) {
                return apple.getColor().equals("green");
            }
        });


        Thread thread = new Thread(()-> System.out.println("a"));

        a.sort((a1,a2)->a1.getHeight().compareTo(a2.getHeight()));

        a.sort(comparing(Apple::getHeight));


        BiPredicate<List<String>,String> contains = List::contains;


        ArrayList<Apple> arrayList = new ArrayList<>();


       // Function<Apple>


        Predicate<Apple> redApple = (red)->red.getHeight().equals("red");



   //    Predicate<Apple> notRedApple = filterGreen1.



    }

}
