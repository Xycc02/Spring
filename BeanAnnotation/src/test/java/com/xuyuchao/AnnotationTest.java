package com.xuyuchao;

import com.xuyuchao.Config.MyConfig;
import com.xuyuchao.pojo.Dog;
import com.xuyuchao.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: xuyuchao
 * @Date: 2022-04-25-17:31
 * @Description:
 */
public class AnnotationTest {
    /**
     * Bean以及属性的注解方式
     */
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("user1");
        user.info();
        System.out.println(user.getName());
    }

    /**
     * 配置类,不需要xml
     */
    @Test
    public void test2() {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Dog dog = (Dog) context.getBean("dog");
        dog.shout();
    }
}
