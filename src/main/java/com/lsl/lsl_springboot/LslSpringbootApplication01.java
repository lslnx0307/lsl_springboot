package com.lsl.lsl_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author v-jasperli
 * @Info 如果打成war部署的话，必须在启动类继承 SpringBootServletInitializer 抽象类 并且重写configure方法
 */
@SpringBootApplication
public class LslSpringbootApplication01 extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(LslSpringbootApplication01.class,args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(LslSpringbootApplication01.class);
    }
}
