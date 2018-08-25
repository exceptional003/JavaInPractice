package com.imooc.diveinspringboot.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 *
 * AfterHelloWorld {@link ApplicationListener}  监听  {@link ContextRefreshedEvent}
 *
 */

//@Order(Ordered.LOWEST_PRECEDENCE)
public class AfterHelloWorldApplicationListener implements ApplicationListener<ContextRefreshedEvent>,Ordered {


    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.err.println("AfterHelloWorldApplicationListener : "
                + event.getApplicationContext().getId()
                + " , timestamp" + event.getTimestamp());
    }

    @Override
    public int getOrder() {
        return Integer.MAX_VALUE;
    }
}
