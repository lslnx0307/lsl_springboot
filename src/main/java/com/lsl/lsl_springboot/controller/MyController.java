package com.lsl.lsl_springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: lsl_springboot
 * @description:
 * @author: v-jasperli
 * @create: 2019-04-08 17:36
 **/
@RestController
public class MyController {

    @GetMapping("/hello")
    public String hello() {
        return "hello, spring boot";
    }

    @GetMapping("/home")
    public String home() {
        return "this is spring boot home";
    }
}
