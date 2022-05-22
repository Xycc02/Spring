package com.xuyuchao.StaticProxy;

/**
 * @Author: xuyuchao
 * @Date: 2022-04-25-19:07
 * @Description: 客户
 * 在这个过程中，你直接接触的就是中介，就如同现实生活中的样子，你看不到房东，但是你依旧租到了房东的房子通过代理，
 * 这就是所谓的代理模式，程序源自于生活，所以学编程的人，一般能够更加抽象的看待生活中发生的事情。
 *
 * 静态代理的好处:
 *  可以使得我们的真实角色更加纯粹 . 不再去关注一些公共的事情 .
 *  公共的业务由代理来完成 . 实现了业务的分工 ,
 *  公共业务发生扩展时变得更加集中和方便 .
 * 缺点 :
 *  类多了,多了代理类,工作量变大了,开发效率降低 .
 *  我们想要静态代理的好处,又不想要静态代理的缺点,所以,就有了动态代理 !
 */
public class Client {
    public static void main(String[] args) {
        //房东要租房
        Host host = new Host();
        //中介帮房东
        Proxy proxy = new Proxy(host);
        //成交
        proxy.rent();
    }
}
