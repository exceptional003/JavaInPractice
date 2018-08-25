package com.imooc.diveinspringboot.bootstrap;

import com.imooc.diveinspringboot.annotation.EnableHelloWorld;
import com.imooc.diveinspringboot.repository.MyFirstLevelRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * EnableHelloWorld 引导类
 */

@EnableHelloWorld
public class EnableHelloWorldBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new SpringApplicationBuilder(EnableHelloWorldBootstrap.class)
                        .web(WebApplicationType.NONE).run(args);
//得到 helloWorld
        String helloWorld = context.getBean("helloWorld", String.class);
        //检验是否存在
        System.out.println("helloWorld Bean :" + helloWorld);

        //关闭应用上下文
        context.close();
    }
}
