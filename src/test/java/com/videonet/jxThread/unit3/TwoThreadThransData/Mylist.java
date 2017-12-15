package com.videonet.jxThread.unit3.TwoThreadThransData;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tangjinhui
 * @date 2017/12/4
 */
public class Mylist {

    private List mylist = new ArrayList();

    public void add(){
        mylist.add("test");
    }

    public int size(){
        return mylist.size();
    }

}
