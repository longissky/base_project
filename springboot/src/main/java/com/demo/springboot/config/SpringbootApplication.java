package com.demo.springboot.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 该注解指定项目为springboot，由此类当作程序入口
 自动装配 web 依赖的环境
 
**/
@SpringBootApplication
@ComponentScan(value = "com.demo")
public class SpringbootApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }
}