package com.videonet.comm.aop;

import java.lang.annotation.*;

/**
 * Created by tangjinhui on 2017/10/31.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LoggerAdvice {

    public String description();

}
