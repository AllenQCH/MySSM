package com.itheima.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//整合spring与springmvc；web容器配置类
public class ServletConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class}; //当web容器启动时，这个配置类加载他对应的bean
    }
    //小提示；上面的是root容器；下面的是servlet容器
    //上面的是spring容器，下面的是springmvc容器，他们各自都有各自的bean
    //spring容器中的bean不可以访问springmvc容器中的bean；但是springMVC容器中的bean可以访问springmvc容器中的bean；属于父子容器
    //若布希昂有区别，直接把所有bean配置到springmvc容器中即可
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};  //当web容器启动时，这个配置类加载他对应的bean
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
