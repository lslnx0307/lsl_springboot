package com.lsl.lsl_springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: lsl_springboot
 * @description:
 * @author: v-jasperli
 * @create: 2019-04-08 17:36
 **/
@RestController
public class MyController {

    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping("/hello")
    public String hello() {
        System.out.println("hello");
        return "hello, spring boot";
    }

    @GetMapping("/home")
    public String home() {
        return "this is spring boot home";
    }

    @RequestMapping("/testRedis")
    public String testRedis() {
        redisTemplate.opsForValue().set("lsl", "123");
        return "OK";
    }

}
