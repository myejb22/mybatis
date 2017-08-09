package com.mybatis.mapper;

import com.mybatis.User;
import com.mybatis.po.spread.UserCustom;
import com.mybatis.vo.UserVo;

import java.util.List;

/**
 * <p>mybatis的mapper接口</p>
 *
 * @author Andy
 * @date 2017/7/27
 */
public interface UserMapper {

    User findUserById(int id) throws Exception;

    /**
     * 通过id进行查询，并且使用resultMap来进行映射
     * @param id
     * @return
     * @throws Exception
     */
    User findUserByResultMap(int id) throws Exception;

    List<User> findUserByName(String username) throws Exception;

    List<UserCustom> findUserList(UserVo userVo) throws Exception;

    void insertUser(User user) throws Exception;

    void deleteUser(int id) throws Exception;

    void updateUser(User user) throws Exception;

}
