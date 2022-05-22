package com.xuyuchao;

import com.xuyuchao.SpringAPI.Service.UserService;
import com.xuyuchao.SpringAPI.Service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: xuyuchao
 * @Date: 2022-04-26-15:31
 * @Description:
 * Aop的重要性 : 很重要 . 一定要理解其中的思路 , 主要是思想的理解这一块 .
 *
 * Spring的Aop就是将公共的业务 (日志 , 安全等) 和领域业务结合起来 , 当执行领域业务时 , 将会把公共业务加进来 . 实现公共业务的重复利用 .
 * 领域业务更纯粹 , 程序猿专注领域业务 , 其本质还是动态代理 .
 */
public class SpringAPITest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //AOP代理的是接口
        UserService userService = (UserService) context.getBean("userServiceImpl1");
        userService.add();

    }
}
