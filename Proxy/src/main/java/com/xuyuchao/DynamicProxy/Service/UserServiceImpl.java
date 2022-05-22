package com.xuyuchao.DynamicProxy.Service;

/**
 * @Author: xuyuchao
 * @Date: 2022-04-26-14:42
 * @Description: 有接口,JDK动态代理,需求,在不改变源代码的情况下增强method方法
 */
public class UserServiceImpl implements UserService{
    /**
     * 要增强的方法
     */
    @Override
    public void method() {
        System.out.println("原有的逻辑!");
    }
}
