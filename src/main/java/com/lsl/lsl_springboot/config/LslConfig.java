package com.lsl.lsl_springboot.config;

import com.lsl.lsl_springboot.compent.LslImportBeanDefinitionRegister;
import com.lsl.lsl_springboot.compent.LslImportSelector;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @program: lsl_springboot
 * @description:
 * @author: v-jasperli
 * @create: 2019-04-16 16:14
 **/
@Configuration
@Import(value = {LslImportSelector.class,LslImportBeanDefinitionRegister.class})
public class LslConfig {
}
