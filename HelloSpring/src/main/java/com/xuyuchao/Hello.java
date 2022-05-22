package com.xuyuchao;

/**
 * @Author: xuyuchao
 * @Date: 2022-04-24-17:23
 * @Description:    Hello类
 */
public class Hello {
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("Hello,"+ name );
    }
}
