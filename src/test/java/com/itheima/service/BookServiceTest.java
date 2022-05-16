package com.itheima.service;

import com.itheima.config.SpringConfig;
import com.itheima.domain.Book;
import com.itheima.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

//单元测试，如果测试的是注解配置类，则使用`@ContextConfiguration(classes = 配置类.class)
//单元测试，如果测试的是配置文件，则使用`@ContextConfiguration(locations={配置文件名,...})



//设置类运行器
@RunWith(SpringJUnit4ClassRunner.class)
//设置Spring环境对应的配置类
@ContextConfiguration(classes = SpringConfig.class) //加载配置类
public class BookServiceTest {

    //支持自动装配注入bean
    @Autowired
    private BookService bookService;
    @Test
    public void testGetById(){
        Book book = bookService.getById(1);
        System.out.println(book);
    }

    @Test
    public void testGetAll(){
        List<Book>  all = bookService.getAll();
        System.out.println(all);
    }

}
