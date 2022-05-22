package com.xuyuchao.pojo;

import org.springframework.stereotype.Component;

/**
 * @Author: xuyuchao
 * @Date: 2022-04-25-17:54
 * @Description:
 */
@Component//将Dog类放到容器中管理
public class Dog {
    public void shout() {
        System.out.println("汪!");
    }
}
