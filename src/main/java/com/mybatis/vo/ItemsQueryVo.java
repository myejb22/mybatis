package com.mybatis.vo;

import com.mybatis.po.Items;
import com.mybatis.po.spread.ItemsCustom;

/**
 * <p>前端查询参数封闭对象</p>
 *
 * @author Andy
 * @date 2017/8/8
 */
public class ItemsQueryVo {

    private Items items;
    private ItemsCustom itemsCustom;

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public ItemsCustom getItemsCustom() {
        return itemsCustom;
    }

    public void setItemsCustom(ItemsCustom itemsCustom) {
        this.itemsCustom = itemsCustom;
    }
}
