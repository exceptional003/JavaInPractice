package com.imooc.diveinspringboot.configuration;


import com.imooc.diveinspringboot.annotation.EnableHelloWorld;
import com.imooc.diveinspringboot.condition.ConditionOnSystemProperty;
import org.springframework.context.annotation.Configuration;

/**
 * helloworld 自动装配
 */
@Configuration  //Spring 模式注解装配
@EnableHelloWorld   //Spring @Enable 模块装配
@ConditionOnSystemProperty(name = "user.name", value = "Charlie")   //条件装配
public class HelloWorldAutoConfiguration {



}
