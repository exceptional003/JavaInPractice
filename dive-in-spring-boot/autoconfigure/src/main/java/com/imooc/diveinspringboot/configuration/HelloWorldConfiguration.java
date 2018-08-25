package com.imooc.diveinspringboot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * helloworldConfiguration
 */

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String helloWorld() {
        return "Hello，World 2018";
    }
} 
