package com.xyc.beanLifeCycle.test;

import com.xyc.beanLifeCycle.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description: beanLifeCycleTest
 * @Author XYC
 * @Date: 2023/3/6 22:14
 * @Version 1.0
 */
public class beanLifeCycleTest {

    public static void main(String[] args) {

        System.out.println("现在开始初始化容器");

        ApplicationContext factory = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("容器初始化成功");
        //得到Preson，并使用
        Person person = factory.getBean("person",Person.class);
        System.out.println(person);

        System.out.println("现在开始关闭容器！");
        ((ClassPathXmlApplicationContext)factory).registerShutdownHook();
    }
}