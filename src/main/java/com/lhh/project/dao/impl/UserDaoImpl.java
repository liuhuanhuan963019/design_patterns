package com.lhh.project.dao.impl;

import com.lhh.project.dao.UserDao;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/24 17:46
 * @Description
 */
public class UserDaoImpl implements UserDao {
    public UserDaoImpl() {
        System.out.println("userdao实例化对象创建了。。。。");
    }

    @Override
    public void add() {
        System.out.println("userdao");
    }
}
