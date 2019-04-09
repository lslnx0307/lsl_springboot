package com.lsl.lsl_springboot.common;

import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @program: lsl_springboot
 * @description: 自定义servlet
 * @author: v-jasperli
 * @create: 2019-04-08 18:06
 **/
@Component
public class MyServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("初始化servlet");
        super.init();
    }

    @Override
    protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("hello......");
    }

    @Override
    protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
