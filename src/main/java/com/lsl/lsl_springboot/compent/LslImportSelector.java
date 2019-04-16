package com.lsl.lsl_springboot.compent;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @program: lsl_springboot
 * @description:
 * @author: v-jasperli
 * @create: 2019-04-16 16:15
 **/
public class LslImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[] {"com.lsl.lsl_springboot.compent.LslServiceImpl"};
    }
}
