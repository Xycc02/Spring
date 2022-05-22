package com.xuyuchao.Annotation.Service;

import org.springframework.stereotype.Component;

/**
 * @Author: xuyuchao
 * @Date: 2022-04-26-15:17
 * @Description:
 */
@Component(value = "userServiceImpl3")
public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("增加用户");
    }

    @Override
    public void delete() {
        System.out.println("删除用户");
    }

    @Override
    public void update() {
        System.out.println("修改用户");
    }

    @Override
    public void search() {
        System.out.println("查询用户");
    }
}
