package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration  //将其标识为一个配置类,替换`applicationContext.xml，就可以删除applicationContext.xml
@ComponentScan({"com.itheima.service"}) //扫描他的bean;用于设定扫描路径，此注解只能添加一次，多个数据请用数组格式,逗号隔开
@PropertySource("classpath:jdbc.properties")    //加载properties文件
@Import({JdbcConfig.class,MyBatisConfig.class}) //加载mybatis的两个配置类
@EnableTransactionManagement    //添加事务管理
public class SpringConfig {
}
