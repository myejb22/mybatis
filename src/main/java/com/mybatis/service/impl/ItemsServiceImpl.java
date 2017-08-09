package com.mybatis.service.impl;

import com.mybatis.mapper.ItemsCustomMapper;
import com.mybatis.mapper.ItemsMapper;
import com.mybatis.po.Items;
import com.mybatis.po.spread.ItemsCustom;
import com.mybatis.service.ItemsService;
import com.mybatis.vo.ItemsQueryVo;
import org.springframework.beans.BeanUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p></p>
 *
 * @author Andy
 * @date 2017/8/8
 */
public class ItemsServiceImpl implements ItemsService {

    @Resource
    private ItemsCustomMapper itemsCustomMapper;

    @Resource
    private ItemsMapper itemsMapper;

    @Override
    public List<ItemsCustom> findItemsList(ItemsQueryVo queryVo) throws Exception {
        return itemsCustomMapper.findItemsList(queryVo);
    }

    @Override
    public ItemsCustom findItemsById(Integer id) throws Exception {
        Items items = itemsMapper.selectByPrimaryKey(id);
        ItemsCustom itemsCustom = new ItemsCustom();
        if (null != items) {
            BeanUtils.copyProperties(items, itemsCustom);
        }
        return itemsCustom;
    }

    @Override
    public void updateByItems(Integer id, ItemsCustom itemsCustom) throws Exception {
        //添加业务校验，通常在service接口对关键参数进行校验
        //校验 id是否为空，如果为空抛出异常

        //更新商品信息使用updateByPrimaryKeyWithBLOBs根据id更新items表中所有字段，包括 大文本类型字段
        //updateByPrimaryKeyWithBLOBs要求必须转入id
        itemsCustom.setId(id);
        itemsMapper.updateByPrimaryKeyWithBLOBs(itemsCustom);
    }
}
