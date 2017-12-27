package com.videonet.Java8Sz.Lambda.Final;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tangjinhui
 * @Description：
 * @date 2017/12/22
 */
public  class FilterUtil {

    public static <T>List<T> filter(List<T> list,Predicate<T> p){
        List<T> result = new ArrayList<>();

        for(T t :list){
            if(p.test(t)){
                result.add(t);
            }
        }

        return result;
    }

}
