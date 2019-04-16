package com.lsl.lsl_springboot.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @program: lsl_springboot
 * @description: 自定义配置类
 * @author: v-jasperli
 * @create: 2019-04-08 17:43
 **/
@Configuration
public class MyWebConfig extends WebMvcConfigurerAdapter {

    @Autowired
    MyInteceptor myInteceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //拦截器中的注册类
        InterceptorRegistration interceptorRegistration = registry.addInterceptor(myInteceptor);
        //excludePathPatterns 哪些路径不走过滤器
//        interceptorRegistration.excludePathPatterns("/home");
    }
}
