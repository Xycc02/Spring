package com.xuyuchao;

import com.xuyuchao.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: xuyuchao
 * @Date: 2022-04-24-18:13
 * @Description:
 */
public class UserTest {
    //通过无参构造创建ioc对象
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //在执行getBean的时候, user已经创建好了 , 通过无参构造
        User user = (User) context.getBean("user1");
        user.show();
    }

    //通过有参构造创建ioc对象
    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //在执行getBean的时候, user已经创建好了 , 通过无参构造
        User user = (User) context.getBean("user2");
        user.show();
    }
}
