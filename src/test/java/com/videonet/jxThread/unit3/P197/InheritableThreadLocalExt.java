package com.videonet.jxThread.unit3.P197;

import java.util.Date;

/**
 * @author tangjinhui
 * @Description：
 * @date 2017/12/14
 */
public class InheritableThreadLocalExt extends  InheritableThreadLocal {

    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }
}
