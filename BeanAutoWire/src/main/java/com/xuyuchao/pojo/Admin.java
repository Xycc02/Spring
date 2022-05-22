package com.xuyuchao.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

/**
 * @Author: xuyuchao
 * @Date: 2022-04-25-16:51
 * @Description:通过注解方式实现自动装配,其封装了set方法
 */
public class Admin {
    //如果允许对象为null，设置required = false,默认为true
    @Autowired(required = true)
    private Cat cat;

    @Autowired
    private Dog dog;

    @Autowired
    @Qualifier(value = "pig1")
    private Pig pig;

    @Resource(name = "wolf1")
    private Wolf wolf;

    public Wolf getWolf() {
        return wolf;
    }

    public Cat getCat() {
        return cat;
    }

    public Dog getDog() {
        return dog;
    }

    public Pig getPig() {
        return pig;
    }
}
