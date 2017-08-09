package com.mybatis.mapper;

import com.mybatis.User;
import com.mybatis.po.Orders;

import java.util.List;

/**
 * <p></p>
 *
 * @author Andy
 * @date 2017/8/2
 */
public interface OrderMappers {

    Orders findOrdersById(int id) throws Exception;

    List<Orders> findOrdersList() throws Exception;

    List<User> findUserAndItemsByResultMap() throws Exception;

    List<Orders> findOrdersUserLazyLoading() throws Exception;
}
