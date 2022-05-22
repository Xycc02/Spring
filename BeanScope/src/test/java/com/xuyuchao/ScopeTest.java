package com.xuyuchao;

import com.xuyuchao.Service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: xuyuchao
 * @Date: 2022-04-24-21:00
 * @Description:
 */
public class ScopeTest {
    /**
     * Singleton(单例模式)
     * 当一个bean的作用域为Singleton，那么Spring IoC容器中只会存在一个共享的bean实例，
     * 并且所有对bean的请求，只要id与该bean定义相匹配，则只会返回bean的同一实例。
     * Singleton是单例类型，就是在创建起容器时就同时自动创建了一个bean的对象，不管你是否使用，他都存在了，每次获取到的对象都是同一个对象。
     * 注意，Singleton作用域是Spring中的缺省作用域。
     */
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService1 = (UserService) context.getBean("userService1");
        UserService userService2 = (UserService) context.getBean("userService1");
        System.out.println(userService1 == userService2);
    }

    /**
     * 当一个bean的作用域为Prototype，表示一个bean定义对应多个对象实例。
     *  Prototype作用域的bean会导致在每次对该bean请求（将其注入到另一个bean中，或者以程序的方式调用容器的getBean()方法）时都会创建一个新的bean实例。
     *  Prototype是原型类型，它在我们创建容器的时候并没有实例化，而是当我们获取bean的时候才会去创建一个对象，而且我们每次获取到的对象都不是同一个对象。
     *  根据经验，对有状态的bean应该使用prototype作用域，而对无状态的bean则应该使用singleton作用域。
     */
    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService1 = (UserService) context.getBean("userService2");
        UserService userService2 = (UserService) context.getBean("userService2");
        System.out.println(userService1 == userService2);
    }

}
