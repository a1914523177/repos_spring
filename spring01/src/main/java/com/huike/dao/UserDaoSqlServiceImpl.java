package com.huike.dao;

public class UserDaoSqlServiceImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("sqlService获取用户数据");
    }
}
