package com.imooc.diveinspringboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.HashSet;

/**
 * {@link org.springframework.boot.SpringApplication} 引导类
 */
//@SpringBootApplication
public class SpringApplicationBootstrap {
    public static void main(String[] args) {
//        SpringApplication.run(SpringApplicationBootstrap.class, args);
//        SpringApplication.run(ApplicationConfiguration.class, args);
        HashSet<String> sources = new HashSet<>();
        //配置Class 名称
        sources.add(ApplicationConfiguration.class.getName());
        //
        SpringApplication springApplication = new SpringApplication();
        springApplication.setSources(sources);
//        springApplication.setWebApplicationType(WebApplicationType.NONE);
        ConfigurableApplicationContext context = springApplication.run(args);
        ApplicationConfiguration bean = context.getBean(ApplicationConfiguration.class);
        System.err.println(bean);


    }

    @SpringBootApplication
    public static class ApplicationConfiguration {

    }
}
