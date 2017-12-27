package com.videonet.comm.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author tangjinhui
 * @Description：
 * @date 2017/12/27
 */

@Component
@Aspect
@Order(2)
public class TestAopManage {

//    private Logger logger = Logger.getLogger(this.getClass());

    private Logger logger = Logger.getLogger(this.getClass());

    @Before("within(com.videonet.*) && @annotation(aop)")
    public void beforTest(JoinPoint joinpoint, TestAop aop){

        logger.info(joinpoint.getSignature().toString());
    }

}
