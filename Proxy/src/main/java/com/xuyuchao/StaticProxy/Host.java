package com.xuyuchao.StaticProxy;

/**
 * @Author: xuyuchao
 * @Date: 2022-04-25-19:06
 * @Description:
 */
public class Host implements Rent{
    @Override
    public void rent() {
        System.out.println("房屋出租!");
    }
}
