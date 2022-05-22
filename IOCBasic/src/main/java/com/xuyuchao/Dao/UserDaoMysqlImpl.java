package com.xuyuchao.Dao;

/**
 * @Author: xuyuchao
 * @Date: 2022-04-24-17:46
 * @Description:
 */
public class UserDaoMysqlImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("MySql获取用户数据");
    }
}
