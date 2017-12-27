package com.videonet.comm.aop;

import java.lang.annotation.*;

/**
 * @author tangjinhui
 * @Description：
 * @date 2017/12/27
 */


@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface TestAop {

    String name() default "";

}
