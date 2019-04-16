package com.lsl.lsl_springboot.config;

import com.lsl.lsl_springboot.condition.LslAspect;
import com.lsl.lsl_springboot.condition.LslCondition;
import com.lsl.lsl_springboot.condition.LslLog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @program: lsl_springboot
 * @description:
 * @author: v-jasperli
 * @create: 2019-04-16 16:54
 **/
@Configuration
public class ConditionConfig {


    @Bean
    public LslAspect lslAspect() {
        System.out.println("LslAspect自动装配到容器中");
        return new LslAspect();
    }

    @Conditional(value = LslCondition.class)
    @Bean
    public LslLog lslLog() {
        System.out.println("LslLog自动装配到容器中");
        return new LslLog();
    }

    /*@Bean
    public LslLog lslLog() {
        System.out.println("LslLog自动装配到容器中");
        return new LslLog();
    }

    @Bean
    @Conditional(value = LslCondition.class)
    public LslAspect lslAspect() {
        System.out.println("LslAspect自动装配到容器中");
        return new LslAspect();
    }*/
}
