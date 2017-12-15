package com.videonet.jxThread;

import java.util.HashMap;

/**
 * @author tangjinhui
 * @date 2017/11/29
 */
public class TestMapClass {

    private HashMap<String,Integer> map = new HashMap<>();

    public synchronized void add(String key){
        Integer value = map.get(key);
        if(value != null){
            map.put(key,value+1);
        }else{
            map.put(key,value);
        }
    }

}
