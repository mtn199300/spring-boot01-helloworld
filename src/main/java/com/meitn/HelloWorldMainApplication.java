package com.meitn;

import com.meitn.controller.MyBeanRegistrar;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * @author meitn
 * @date: 2019/1/22 14:35
 * @SpringBootApplication注解标注一个主程序类 表明该应用是一个springboot应用
 */

@Import(MyBeanRegistrar.class)
@SpringBootApplication
public class HelloWorldMainApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldMainApplication.class,args);
    }
}
