package com.videonet.springjm.Unit1.P24;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author tangjinhui
 * @Description：
 * @date 2017/12/27
 */
public class TestIoc {


    public static void main(String[] args) {




    }

    public void test(HttpServletRequest request, HttpServletResponse response){

//        HttpSession session = request.getSession();
//        ServletContext context = session.getServletContext();
//
//        ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(context);
//
//        ApplicationContext applicationContext = (ApplicationContext)WebApplicationContextUtils.getWebApplicationContext(context);

        HttpSession session =request.getSession();
        ServletContext context = session.getServletContext(); //arg0.getSession().getServletContext();
        WebApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(context);

//        ClassName clazz =(ClassName)ctx.getBean("beanName");clazz
    }

}
