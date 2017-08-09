package com.mybatis.dao;

import com.mybatis.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * <p></p>
 *
 * @author Andy
 * @date 2017/7/27
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {
    /*private SqlSessionFactory sessionFactory;

    public UserDaoImpl(SqlSessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }*/

    public User findUserById(int id) throws Exception {
        SqlSession sqlSession = this.getSqlSession();
        User user = sqlSession.selectOne("test.findUserById", id);
        return user;
    }

    public void insertUser(User user) throws Exception {
        SqlSession sqlSession = this.getSqlSession();
        sqlSession.insert("test.insertUser", user);
        sqlSession.commit();
    }

    public void deleteUser(int id) throws Exception {
        SqlSession sqlSession = this.getSqlSession();
        sqlSession.delete("test.deleteUser", id);
        sqlSession.commit();
    }

    public void updateUser(User user) throws Exception {
        SqlSession sqlSession = this.getSqlSession();
        sqlSession.update("test.updateUser", user);
        sqlSession.commit();
    }
}
