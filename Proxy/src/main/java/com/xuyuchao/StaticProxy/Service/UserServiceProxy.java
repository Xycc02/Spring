package com.xuyuchao.StaticProxy.Service;

/**
 * @Author: xuyuchao
 * @Date: 2022-04-25-19:21
 * @Description:
 * 要在原有的UserService实现类UserServiceImpl中增加新的[日志]业务
 * 通过创建代理类来实现UserService接口,来实现不改变原有代码的情况下增加新的业务
 */
public class UserServiceProxy implements UserService{

    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    public void log(String msg) {
        System.out.println("执行了" + msg + "方法!");
    }
    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void delete() {
        log("delete");
        userService.delete();
    }

    @Override
    public void update() {
        log("update");
        userService.update();
    }

    @Override
    public void query() {
        log("query");
        userService.query();
    }
}
