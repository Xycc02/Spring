package com.xuyuchao.DefineClass.PointCut;

/**
 * @Author: xuyuchao
 * @Date: 2022-04-26-15:49
 * @Description: 自定义切入类
 */
public class DefinePointCut {
    public void before(){
        System.out.println("---------方法执行前---------");
    }
    public void after(){
        System.out.println("---------方法执行后---------");
    }
}
