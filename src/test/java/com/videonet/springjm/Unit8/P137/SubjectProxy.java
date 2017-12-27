package com.videonet.springjm.Unit8.P137;

import org.mockito.cglib.proxy.Enhancer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author tangjinhui
 * @Description：
 * @date 2017/12/27
 */
public class SubjectProxy implements  ISubject {

    private ISubject subject;

    public String request(){
        String originalResult = subject.request();
        return  "Proxy:"+originalResult;

    }

    public ISubject getSubject() {
        return subject;
    }

    public void setSubject(ISubject subject) {
        this.subject = subject;
    }


    public static void main(String[] args) {

//        SubjectProxy subjectProxy = (SubjectProxy) Proxy.newProxyInstance(SubjectProxy.class.getClassLoader(), new Class[]{SubjectProxy.class},
//                ((proxy, method, args1) ->{ return null;}));


        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Requestable.class);
        enhancer.setCallback(new RequesrCtrCallback());


        Requestable proxy = (Requestable)enhancer.create();
        proxy.request();
    }
}
