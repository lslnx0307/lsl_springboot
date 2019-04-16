package com.lsl.lsl_springboot.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author v-jasperli
 * @dec 条件装配
 */
public class LslCondition implements Condition {

    @Override
    public boolean matches(ConditionContext conditionContext,AnnotatedTypeMetadata annotatedTypeMetadata) {
        if (conditionContext.getBeanFactory().containsBean("lslAspect")) {
            return true;
        }
        return false;
    }
}
