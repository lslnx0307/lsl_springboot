package com.lsl.lsl_springboot.compent;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @program: lsl_springboot
 * @description:
 * @author: v-jasperli
 * @create: 2019-04-16 16:18
 **/
public class LslImportBeanDefinitionRegister implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata,BeanDefinitionRegistry beanDefinitionRegistry) {
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(LslDaoImpl.class);
        beanDefinitionRegistry.registerBeanDefinition("lslDaoImpl", rootBeanDefinition);
    }
}
