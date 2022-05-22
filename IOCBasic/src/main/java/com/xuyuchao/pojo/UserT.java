package com.xuyuchao.pojo;

/**
 * @Author: xuyuchao
 * @Date: 2022-04-24-18:17
 * @Description:
 */
public class UserT {
    private String name;

    public UserT(String name) {
        System.out.println("UserT的有参构造方法");
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("name="+ name );
    }
}
