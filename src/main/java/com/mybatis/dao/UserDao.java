package com.mybatis.dao;

import com.mybatis.User;

/**
 * <p>UserDao接口</p>
 *
 * @author Andy
 * @date 2017/7/27
 */
public interface UserDao {

    User findUserById(int id) throws Exception;

    void insertUser(User user) throws Exception;

    void deleteUser(int id) throws Exception;

    void updateUser(User user) throws Exception;
}
