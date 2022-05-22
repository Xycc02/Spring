package com.xuyuchao.Service;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.xuyuchao.Dao.UserDao;
import com.xuyuchao.Dao.UserDaoImpl;

/**
 * @Author: xuyuchao
 * @Date: 2022-04-24-17:41
 * @Description:
 */
public class UserServiceImpl implements UserService{
    //原始方法要在Service层中调用Dao
    //UserDao userDao = new UserDaoImpl();
    //利用set方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
