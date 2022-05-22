package com.xuyuchao;

import com.xuyuchao.Dao.UserDaoMysqlImpl;
import com.xuyuchao.Dao.UserDaoOracleImpl;
import com.xuyuchao.Service.UserService;
import com.xuyuchao.Service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: xuyuchao
 * @Date: 2022-04-24-17:43
 * @Description:
 */
public class UserServiceTest {
    //原始方法,要哪个实现类就new哪个实现类的方式
    @Test
    public void test1() {
        UserService userService = new UserServiceImpl();
        userService.getUser();
    }
    //利用set方法,这种思想 , 从本质上解决了问题 , 我们程序员不再去管理对象的创建了 , 更多的去关注业务的实现 . 耦合性大大降低 . 这也就是IOC的原型 !
    @Test
    public void test2() {
        UserServiceImpl userService = new UserServiceImpl();
        //Mysql获取数据
        userService.setUserDao(new UserDaoMysqlImpl());
        userService.getUser();
        //Oracle获取数据
        userService.setUserDao(new UserDaoOracleImpl());
        userService.getUser();
    }
    //利用Spring容器管理bean方式
    //到了现在 , 我们彻底不用再程序中去改动了 , 要实现不同的操作 , 只需要在xml配置文件中进行修改 ,
    //所谓的IoC,一句话搞定 : 对象由Spring 来创建 , 管理 , 装配 !
    @Test
    public void test3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userService = (UserServiceImpl) context.getBean("userService");
        userService.getUser();
    }
}
