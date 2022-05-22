package com.xuyuchao.SpringAPI.Proxy;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @Author: xuyuchao
 * @Date: 2022-04-26-15:19
 * @Description:
 */
public class AfterLog implements AfterReturningAdvice {
    /**
     * 带有返回值的后置增强
     * @param o
     * @param method
     * @param objects
     * @param o1
     * @throws Throwable
     */
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println(o1.getClass().getName() + "的" + method.getName() + "方法" + "被执行了!返回值是" + o);
    }
}
