package com.xuyuchao;

import com.xuyuchao.StaticProxy.Service.UserServiceImpl;
import com.xuyuchao.StaticProxy.Service.UserServiceProxy;
import org.junit.Test;

/**
 * @Author: xuyuchao
 * @Date: 2022-04-25-19:21
 * @Description:
 */
public class StaticProxyTest {
    @Test
    public void test() {
        //真实业务
        UserServiceImpl userService = new UserServiceImpl();
        //代理类
        UserServiceProxy userServiceProxy = new UserServiceProxy();
        //使用代理类实现日志
        userServiceProxy.setUserService(userService);

        //使用新功能
        userServiceProxy.add();
        userServiceProxy.delete();
        userServiceProxy.update();
        userServiceProxy.query();
    }
}
