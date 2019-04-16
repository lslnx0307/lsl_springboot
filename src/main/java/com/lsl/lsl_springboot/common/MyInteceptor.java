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

    /**
     * preHandle是处理器拦截，在进入到controller的接口方法之前调用的
     * 返回false的时候表示请求结束，true的时候，继续执行 业务流程-> postHandler->afterCompletion
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request,HttpServletResponse response,Object handler) throws Exception {
        System.out.println("我是myInteceptor中的preHandle");
//        return super.preHandle(request,response,handler);
       return true;
    }

    /**
     * posthandle 在执行完业务代码，返回视图之前执行
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */

    @Override
    public void postHandle(HttpServletRequest request,HttpServletResponse response,Object handler,ModelAndView modelAndView) throws Exception {
        System.out.println("我是myInteceptor中的postHandle");
        super.postHandle(request,response,handler,modelAndView);
    }

    /**
     * 在DispatcherServlet完全处理完请求后被调用,可用于清理资源等
     *      *
     *      * 当有拦截器抛出异常时,会从当前拦截器往回执行所有的拦截器的afterCompletion()
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request,HttpServletResponse response,Object handler,Exception ex) throws Exception {
        System.out.println("我是myInteceptor中的afterCompletion");
        super.afterCompletion(request,response,handler,ex);
    }
}
