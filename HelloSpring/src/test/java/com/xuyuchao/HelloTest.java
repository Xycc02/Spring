package com.xuyuchao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: xuyuchao
 * @Date: 2022-04-24-17:27
 * @Description:
 */
public class HelloTest {
    /**
     * Hello 对象是谁创建的 ? hello 对象是由Spring创建的
     * Hello 对象的属性是怎么设置的 ? hello 对象的属性是由Spring容器设置的(利用xml配置文件)
     * 这个过程就叫控制反转 :
     *
     * 控制 : 谁来控制对象的创建 , 传统应用程序的对象是由程序本身控制创建的 , 使用Spring后 , 对象是由Spring来创建的
     * 反转 : 程序本身不创建对象 , 而变成被动的接收对象 .
     * 依赖注入 : 就是利用set方法来进行注入的.
     *
     * IOC是一种编程思想，由主动的编程变成被动的接收
     */
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Hello hello = context.getBean("hello", Hello.class);
        hello.show();
    }
}
