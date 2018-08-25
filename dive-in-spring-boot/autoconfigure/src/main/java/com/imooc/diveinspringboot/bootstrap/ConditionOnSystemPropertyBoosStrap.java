package com.imooc.diveinspringboot.bootstrap;

import com.imooc.diveinspringboot.condition.ConditionOnSystemProperty;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * 系统属性条件引导类
 */

public class ConditionOnSystemPropertyBoosStrap {

    @Bean
    @ConditionOnSystemProperty(name = "user.name", value = "Charlie")
    public String helloWorld() {
        return "Hello World Charlie";
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new SpringApplicationBuilder(ConditionOnSystemPropertyBoosStrap.class)
                        .web(WebApplicationType.NONE)
                        .run(args);
        //通过类型名称获取HelloWorld bean
        String helloWorld = context.getBean("helloWorld", String.class);
        System.err.println("helllo world bean --:"+helloWorld);

        //关闭应用上下文
        context.close();
    }
}
