package com.lhh.project.service.impl;

import com.lhh.project.dao.UserDao;
import com.lhh.project.service.UserService;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/24 17:47
 * @Description 业务逻辑层实现类
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserServiceImpl() {
        System.out.println("userservice实例化对象创建了。。。。");
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add() {
        System.out.println("userservice.....");
        userDao.add();
    }
}
