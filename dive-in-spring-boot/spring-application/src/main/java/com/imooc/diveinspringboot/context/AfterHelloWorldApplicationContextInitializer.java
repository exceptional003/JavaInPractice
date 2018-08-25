package com.imooc.diveinspringboot.context;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;

public class AfterHelloWorldApplicationContextInitializer
        implements ApplicationContextInitializer, Ordered {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.err.println("AfterHelloWorldApplicationContextInitializer.id:---" + applicationContext.getId());
    }

    @Override
    public int getOrder() {
        return Integer.MAX_VALUE;
//        return Ordered.LOWEST_PRECEDENCE;

    }
}
