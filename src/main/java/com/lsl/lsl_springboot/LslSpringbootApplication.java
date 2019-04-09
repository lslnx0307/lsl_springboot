package com.lsl.lsl_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class LslSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(LslSpringbootApplication.class,args);
    }

}
