package com.videonet.jxThread;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author tangjinhui
 * @date 2017/11/29
 */
public class TestConcurrentHashpClass {

    private ConcurrentHashMap<String,Integer>  map= new ConcurrentHashMap();

    public void add(String key){
        Integer value = map.get(key);
        if(key == null){
            map.put(key,value);
        }else{
            map.put(key,value+1);
        }
    }

}
