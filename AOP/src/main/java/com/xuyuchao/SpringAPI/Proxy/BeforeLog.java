package com.xuyuchao.SpringAPI.Proxy;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @Author: xuyuchao
 * @Date: 2022-04-26-15:19
 * @Description: 利用Spring自带API来实现增强
 */
public class BeforeLog implements MethodBeforeAdvice {
    /**
     *
     * @param method
     * @param objects
     * @param o
     * @throws Throwable
     * 前置增强
     * method : 要执行的目标对象的方法
     * objects : 被调用的方法的参数
     * Object : 目标对象
     */
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(o.getClass().getName() + "的" + method.getName() + "方法被执行了!");
    }
}
