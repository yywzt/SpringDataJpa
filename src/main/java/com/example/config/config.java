package com.example.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.support.OpenSessionInViewFilter;

/**
 * @author ywyw2424@foxmail.com
 * @date 2018/9/30 15:20
 * @desc
 */
@Configuration
public class config {

//    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new OpenSessionInViewFilter());
        filterRegistrationBean.addUrlPatterns("/**");
        return filterRegistrationBean;
    }
}
