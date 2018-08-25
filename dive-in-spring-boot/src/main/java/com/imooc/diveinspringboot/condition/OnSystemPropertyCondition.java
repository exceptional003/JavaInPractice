package com.imooc.diveinspringboot.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;


/**
 * 系统属性条件判断
 */
public class OnSystemPropertyCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {

        Map<String, Object> annotationAttributes = annotatedTypeMetadata.getAnnotationAttributes(ConditionOnSystemProperty.class.getName());
        System.err.println(annotationAttributes.toString());
        String attributeName = String.valueOf(annotationAttributes.get("name"));
        String attributeValue = String.valueOf(annotationAttributes.get("value"));

        String systemValue = System.getProperty(attributeName);
        return systemValue.equals(attributeValue);
    }
}
