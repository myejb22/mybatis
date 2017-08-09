package com.mybatis.service;

import com.mybatis.po.spread.ItemsCustom;
import com.mybatis.vo.ItemsQueryVo;

import java.util.List;

/**
 * <p></p>
 *
 * @author Andy
 * @date 2017/8/8
 */
public interface ItemsService {

    List<ItemsCustom> findItemsList(ItemsQueryVo queryVo) throws Exception;

    ItemsCustom findItemsById(Integer id) throws Exception;

    void updateByItems(Integer id, ItemsCustom itemsCustom) throws Exception;
}
