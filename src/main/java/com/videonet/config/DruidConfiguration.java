package com.videonet.config;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by tangjinhui on 2017/10/31.
 */

@Configuration
public class DruidConfiguration {

    @Bean
    public ServletRegistrationBean druidStatViewServlet(){
        ServletRegistrationBean  servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(),"/durid/*");

        servletRegistrationBean.addInitParameter("allow","127.0.0.1");
        servletRegistrationBean.addInitParameter("deny","192.168.5.127");
        servletRegistrationBean.addInitParameter("loginUsername","admin1");
        servletRegistrationBean.addInitParameter("loginPassword","111111");

        servletRegistrationBean.addInitParameter("resetEnable","false");

        return servletRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean druidStatFilter(){

        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new WebStatFilter());

        //添加过滤规则
        filterRegistrationBean.addUrlPatterns("/*");

        //添加不需要忽略的格式

        filterRegistrationBean.addInitParameter("exclusions","*.jpg,*.css,/durid/*");

        return filterRegistrationBean;
    }

}
