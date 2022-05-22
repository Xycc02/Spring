package com.xuyuchao.Annotation.Proxy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @Author: xuyuchao
 * @Date: 2022-04-26-16:05
 * @Description: 注解方式AOP
 */
@Component
@Aspect
public class AnnotationPointcut {

    @Before("execution(* com.xuyuchao.Annotation.Service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("前置通知!");
    }

    @After("execution(* com.xuyuchao.Annotation.Service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("后置通知!");
    }

    @Around("execution(* com.xuyuchao.Annotation.Service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) {
        System.out.println("环绕通知前!");
        try {
            proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("环绕通知后!");
    }
}
