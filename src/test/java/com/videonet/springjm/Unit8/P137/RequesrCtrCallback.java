package com.videonet.springjm.Unit8.P137;

import org.mockito.cglib.proxy.MethodInterceptor;
import org.mockito.cglib.proxy.MethodProxy;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author tangjinhui
 * @Description：
 * @date 2017/12/27
 */

@Component
public class RequesrCtrCallback implements MethodInterceptor{

  //  @Override
    public Object intercept(Object object, Method method, Object[]args, MethodProxy methodProxy) throws Throwable {
        if(method.getName().equals("request")){
            System.out.println("before request");

            methodProxy.invokeSuper(object,args);
        }
        return null;
    }

}
