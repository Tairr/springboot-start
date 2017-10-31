package com.videonet.comm.aop;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by tangjinhui on 2017/10/31.
 */
@Aspect
@Service
public class LoggerManage {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Before("within(com.videonet.controller.*) && @annotation(loggerAdvice)")
    public void addBeforeLogger(JoinPoint joinPoint,LoggerAdvice loggerAdvice){

        logger.info("执行"+ loggerAdvice.description() +"开始");
        logger.info(joinPoint.getSignature().toString());
        logger.info(parseParams(joinPoint.getArgs()));

    }


    @After("within(com.videonet..*) && @annotation(loggerAdvice)")
    public void addAfterReturningLogger(JoinPoint joinPoint,LoggerAdvice loggerAdvice){
        logger.info("执行"+loggerAdvice.description()+"结束");
    }

    @AfterThrowing(pointcut = "within(com.videonet..*) && @annotation(loggerAdvice)",throwing = "ex")
    public void addAfterThrowingLogger(JoinPoint joinPoint,LoggerAdvice loggerAdvice,Exception ex){
        logger.error("执行"+loggerAdvice.description()+" 异常"+ex);
    }

    private String parseParams(Object[] params){
        if(null == params || params.length<=0)
            return "";

        StringBuffer param = new StringBuffer("传入参数{}");
        for(Object o:params){
            param.append(ToStringBuilder.reflectionToString(o)).append("  ");
        }
        return param.toString();

    }
}
