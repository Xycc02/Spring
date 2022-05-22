package com.xuyuchao;

import com.xuyuchao.DefineClass.Service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: xuyuchao
 * @Date: 2022-04-26-15:57
 * @Description:
 */
public class DefineClassTest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = (UserService) context.getBean("userServiceImpl2");
        userService.add();
    }
}
