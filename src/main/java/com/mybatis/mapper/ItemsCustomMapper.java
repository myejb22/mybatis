package com.mybatis.mapper;

import com.mybatis.po.spread.ItemsCustom;
import com.mybatis.vo.ItemsQueryVo;

import java.util.List;

/**
 * <p>商品的Mapper类</p>
 *
 * @author Andy
 * @date 2017/8/8
 */
public interface ItemsCustomMapper {

    List<ItemsCustom> findItemsList(ItemsQueryVo queryVo) throws Exception
            ;
}
