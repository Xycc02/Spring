package com.xuyuchao.pojo;

/**
 * @Author: xuyuchao
 * @Date: 2022-04-24-18:12
 * @Description:
 */
public class User {
    private String name;

    public User() {
        System.out.println("user无参构造方法");
    }

    public User(String name) {
        System.out.println("User的有参构造方法");
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("name="+ name );
    }
}
