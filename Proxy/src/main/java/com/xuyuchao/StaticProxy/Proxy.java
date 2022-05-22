package com.xuyuchao.StaticProxy;

/**
 * @Author: xuyuchao
 * @Date: 2022-04-25-19:06
 * @Description: 中介
 */
public class Proxy implements Rent{

    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        seeHouse();
        host.rent();
        fare();
    }
    //看房
    public void seeHouse() {
        System.out.println("带顾客看房!");
    }
    //收中介费
    public void fare() {
        System.out.println("收中介费!");
    }
}
