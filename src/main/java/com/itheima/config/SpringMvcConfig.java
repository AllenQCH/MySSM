package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration  //作为配置类
@ComponentScan("com.itheima.controller")    //扫描包
@EnableWebMvc   //需要查一下什么作用
public class SpringMvcConfig {
}
