package com.huike.service;

import com.huike.dao.UserDao;

public interface UserService {
    void getUser();

    void setUserDao(UserDao userDao);
}
