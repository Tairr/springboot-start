package com.videonet.jxThread.JustTest;

import java.util.HashMap;
import java.util.Map;

/**
 * @author tangjinhui
 * @date 2017/12/12
 */
public class StackNew {

    public static <K,V> Map<K,V> map(){
        return new HashMap<K,V>();
    }

}
