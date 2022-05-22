package com.xuyuchao;

import com.xuyuchao.Annotation.Service.UserService;
import com.xuyuchao.Annotation.Service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: xuyuchao
 * @Date: 2022-04-26-16:11
 * @Description:
 */
public class AnnotationTest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = (UserService) context.getBean("userServiceImpl3");
        userService.add();
    }
}
