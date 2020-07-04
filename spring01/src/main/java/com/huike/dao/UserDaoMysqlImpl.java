package com.huike.dao;

public class UserDaoMysqlImpl implements UserDao {

    private UserDao userDao = new UserDaoImpl();

    @Override
    public void getUser() {
        System.out.println("mysql获取用户数据");
    }
}
