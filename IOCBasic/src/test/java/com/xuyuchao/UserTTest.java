package com.xuyuchao;

import com.xuyuchao.pojo.User;
import com.xuyuchao.pojo.UserT;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: xuyuchao
 * @Date: 2022-04-24-18:21
 * @Description:
 */
public class UserTTest {
    //通过有参构造创建ioc对象
    //在配置文件加载的时候。其中管理的对象都已经初始化了！
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserT userT = (UserT) context.getBean("userT");
        userT.show();
    }
}
