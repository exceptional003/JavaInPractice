package com.imooc.diveinspringboot;


import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplicationEventBootstrap {

    public static void main(String[] args) {
        //创建上下文
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        //注册应用事件监听器
        context.addApplicationListener(event -> {
            System.err.println("监听到事件：" + event);
        });

        //启动上下文
        context.refresh();

        //发事件
        context.publishEvent("publishEvent-----Hello World2017");
        context.publishEvent("publishEvent-----Hello World2018");
        context.publishEvent(new ApplicationEvent
                ("publishEvent-----Hello World2019") {

        });
        //关闭上下文
        context.close();


    }
}
