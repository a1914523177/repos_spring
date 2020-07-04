package com.huike.service;

import com.huike.dao.UserDao;
import com.huike.dao.UserDaoImpl;
import com.huike.dao.UserOImpl;

public class UserServiceImpl implements UserService {

    private UserDao userDao ;

    public void setUserDao(UserDao userDao){
        this.userDao =userDao;
    }

    public void getUser(){
        userDao.getUser();
    }
}
