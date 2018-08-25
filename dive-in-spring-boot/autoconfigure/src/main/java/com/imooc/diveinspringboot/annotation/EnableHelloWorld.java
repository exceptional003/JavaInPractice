package com.imooc.diveinspringboot.annotation;


import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Repository;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
//@Import(HelloWorldImportSelector.class)
@Import(HelloWorldImportSelector.class)
public @interface EnableHelloWorld {
}
