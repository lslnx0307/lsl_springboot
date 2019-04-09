package com.lsl.lsl_springboot.common;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: lsl_springboot
 * @description: 自定义拦截器
 * @author: v-jasperli
 * @create: 2019-04-08 17:55
 **/

@Component
public class MyInteceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request,HttpServletResponse response,Object handler) throws Exception {
        System.out.println("我是myInteceptor中的preHandle");
        return super.preHandle(request,response,handler);
    }

    @Override
    public void postHandle(HttpServletRequest request,HttpServletResponse response,Object handler,ModelAndView modelAndView) throws Exception {
        System.out.println("我是myInteceptor中的postHandle");
        super.postHandle(request,response,handler,modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request,HttpServletResponse response,Object handler,Exception ex) throws Exception {
        System.out.println("我是myInteceptor中的afterCompletion");
        super.afterCompletion(request,response,handler,ex);
    }
}
