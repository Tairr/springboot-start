package com.videonet.springjm.Unit8.P137;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author tangjinhui
 * @Description：
 * @date 2017/12/27
 */
public class RequestCtrInvocationHandler implements InvocationHandler{

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        method.invoke(proxy,args);
        return null;
    }
}
