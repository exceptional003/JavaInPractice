package com.imooc.diveinspringboot.bootstrap;

import com.imooc.diveinspringboot.repository.MyFirstLevelRepository;
import com.imooc.diveinspringboot.service.CalculateService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * {@link com.imooc.diveinspringboot.service.CalculateService}
 */

@SpringBootApplication(scanBasePackages = "com.imooc.diveinspringboot.service")
public class CalculateServiceBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new SpringApplicationBuilder(CalculateServiceBootstrap.class)
                        .web(WebApplicationType.NONE)
                        .profiles("Java8")
                        .run(args);
//得到repository
        CalculateService calculateService =
                context.getBean(CalculateService.class);
        //检验是否存在
        System.out.println("CalculateService  sum(1...10) :" +
                calculateService.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        //关闭应用上下文
        context.close();
    }
}
