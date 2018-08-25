package com.imooc.diveinspringboot.bootstrap;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * {@link EnableAutoConfiguration}  引导类
 */
@EnableAutoConfiguration
public class EnableAutoConfigurationBootstrap {


    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new SpringApplicationBuilder(EnableAutoConfigurationBootstrap.class)
                        .web(WebApplicationType.NONE)
                        .run(args);

        //得到 helloWorld
        String helloWorld = context.getBean("helloWorld", String.class);
        //检验是否存在
        System.err.println("helloWorld Bean :" + helloWorld);


        //关闭应用上下文
        context.close();
    }
}
