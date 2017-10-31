package com.videonet.comm.exception;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by tangjinhui on 2017/10/31.
 */

@ControllerAdvice
public class MyExceptionHandler {

    protected Logger logger = Logger.getLogger(this.getClass());

    public static String DEAFAULT_ERROR_VIEW="error";

    @ExceptionHandler(value = Exception.class)
    public ModelAndView defaultErrorHandler(Exception e, HttpServletRequest request){

        logger.info("请求地址："+request.getRequestURL());
        ModelAndView mav = new ModelAndView();
        logger.info("异常信息：",e);
        mav.setViewName(DEAFAULT_ERROR_VIEW);
        return  mav;
    }

}
