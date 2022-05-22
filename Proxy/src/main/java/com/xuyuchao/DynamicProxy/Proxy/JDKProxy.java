package com.xuyuchao.DynamicProxy.Proxy;

import com.xuyuchao.DynamicProxy.Service.UserService;
import com.xuyuchao.DynamicProxy.Service.UserServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: xuyuchao
 * @Date: 2022-04-26-14:45
 * @Description: 增强类
 * 动态代理的好处
 * 静态代理有的它都有，静态代理没有的，它也有！
 *
 * 可以使得我们的真实角色更加纯粹 . 不再去关注一些公共的事情 .
 * 公共的业务由代理来完成 . 实现了业务的分工 ,
 * 公共业务发生扩展时变得更加集中和方便 .
 * 一个动态代理 , 一般代理某一类业务
 * 一个动态代理可以代理多个类，代理的是接口！
 */
public class JDKProxy {
    public static void main(String[] args) {
        Class[] interfaces = {UserService.class};
        //返回一个代理类对象,其实代理的是接口,只是在使用InvocationHandler实现类上选择增强哪个实现类的哪个方法
        UserService userService = (UserService) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserServiceProxy(new UserServiceImpl()));
        userService.method();
    }
}

//实现InvocationHandler接口,重写invoke方法,创建代理对象,写增强的部分
class UserServiceProxy implements InvocationHandler {

    //private UserService userService;
    //代理对象
    private Object obj;
    //通过有参构造将要代理的对象传递给代理对象
    public UserServiceProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //增强的逻辑
        System.out.println("method之前增强");
        //原来的方法
        Object res = method.invoke(obj, args);
        //增强的逻辑
        System.out.println("method之后增强");
        return res;
    }
}
