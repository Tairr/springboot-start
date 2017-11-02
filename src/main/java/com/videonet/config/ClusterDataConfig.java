package com.videonet.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * @author tangjinhui
 * @date 2017/11/2
 */
@Configuration
@MapperScan(basePackages ="com.videonet.cdao", sqlSessionTemplateRef  = "clusterSqlSessionTemplate" )
public class ClusterDataConfig {

    @Bean(name="clusterDataSource")
    @ConfigurationProperties(prefix = "cluster.datasource")
    public DruidDataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        return dataSource;
    }

    @Bean(name="clusterRegistrationBean")
    public ServletRegistrationBean druidStatViewServlet(){
        ServletRegistrationBean  servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(),"/druid/*");

        servletRegistrationBean.addInitParameter("allow","127.0.0.1");
        servletRegistrationBean.addInitParameter("deny","192.168.5.127");
        servletRegistrationBean.addInitParameter("loginUsername","admin1");
        servletRegistrationBean.addInitParameter("loginPassword","111111");

        servletRegistrationBean.addInitParameter("resetEnable","false");

        return servletRegistrationBean;
    }

    @Bean(name="clusterRegistrationBean")
    public FilterRegistrationBean druidStatFilter(){

        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new WebStatFilter());

        //添加过滤规则
        filterRegistrationBean.addUrlPatterns("/*");

        //添加不需要忽略的格式

        filterRegistrationBean.addInitParameter("exclusions","/static/*,*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");

        return filterRegistrationBean;
    }

    @Bean(name = "clusterSqlSessionFactory")
    public SqlSessionFactoryBean sqlSessionFactoryBean(@Qualifier("clusterDataSource")DruidDataSource dataSource) throws Exception {

        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setTypeAliasesPackage("com.videonet.cdomain");
        return sqlSessionFactoryBean;
    }

    @Bean(name = "clusterTransactionManager")
    public DataSourceTransactionManager testTransactionManager(@Qualifier("clusterDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "clusterSqlSessionTemplate")
    public SqlSessionTemplate masterSqlSessionTemplate(@Qualifier("clusterSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

    // 按照BeanId来拦截配置 用来bean的监控
//    @Bean(value = "druid-stat-interceptor")
//    public DruidStatInterceptor druidStatInterceptor() {
//        DruidStatInterceptor druidStatInterceptor = new DruidStatInterceptor();
//        return druidStatInterceptor;
//    }
//
//    @Bean
//    public BeanNameAutoProxyCreator beanNameAutoProxyCreator() {
//        BeanNameAutoProxyCreator beanNameAutoProxyCreator = new BeanNameAutoProxyCreator();
//        beanNameAutoProxyCreator.setProxyTargetClass(true);
//        // 设置要监控的bean的id
//        beanNameAutoProxyCreator.setBeanNames("*service","*dao","*controller");
//        beanNameAutoProxyCreator.setInterceptorNames("druid-stat-interceptor");
//        return beanNameAutoProxyCreator;
//    }

}
