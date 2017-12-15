package com.videonet.jxThread.JustTest;

import java.util.List;
import java.util.Map;

/**
 * @author tangjinhui
 * @date 2017/12/12
 */
public class TestStackNew {

    static void f(Map<Integer,List<? extends Integer>> map){

    }

    public static void main (String[] args) {
        f(StackNew.map());
    }
}
