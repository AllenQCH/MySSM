package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration  //设置此类为配置类
@ComponentScan({"com.itheima.service"}) //扫描他的bean
@PropertySource("classpath:jdbc.properties")    //加载properties文件
@Import({JdbcConfig.class,MyBatisConfig.class}) //加载mybatis的两个配置类
@EnableTransactionManagement    //添加事务管理
public class SpringConfig {
}
