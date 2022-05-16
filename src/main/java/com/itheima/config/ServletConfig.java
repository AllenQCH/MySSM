package com.itheima.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//整合spring与springmvc；web容器配置类
public class ServletConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    //加载spring配置类
    protected Class<?>[] getRootConfigClasses() {
        //加载配置类初始化容器ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);相当于以前ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        return new Class[]{SpringConfig.class}; //当web容器启动时，这个配置类加载他对应的bean；//
    }
    //小提示；上面的是root容器；下面的是servlet容器
    //上面的是spring容器，下面的是springmvc容器，他们各自都有各自的bean
    //spring容器中的bean不可以访问springmvc容器中的bean；但是springMVC容器中的bean可以访问springmvc容器中的bean；属于父子容器
    //若想没有区别，直接把所有bean配置到springmvc容器中即可

    //加载springmvc配置类
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};  //当web容器启动时，这个配置类加载他对应的bean；
    }

    //设置由springmvc控制器处理的请求映射路径
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
