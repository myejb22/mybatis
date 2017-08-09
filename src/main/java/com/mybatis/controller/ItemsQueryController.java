package com.mybatis.controller;

import com.mybatis.common.JodaDateEditor;
import com.mybatis.po.spread.ItemsCustom;
import com.mybatis.service.ItemsService;
import com.mybatis.vo.ItemsQueryVo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * <p></p>
 *
 * @author Andy
 * @date 2017/8/8
 */
@Controller
@RequestMapping(value = "/items")
public class ItemsQueryController {

    @InitBinder
    protected void databind(WebDataBinder dataBinder) {
        dataBinder.registerCustomEditor(Date.class, new JodaDateEditor());
    }

    @Resource
    private ItemsService itemsService;

    @RequestMapping(value = "/queryItems/list",method = {RequestMethod.POST,RequestMethod.GET})
    public String findItemsList(ItemsQueryVo queryVo, Model model) {
        try {
            //调用service查找 数据库，查询商品列表，这里使用静态数据模拟
            List<ItemsCustom> list = itemsService.findItemsList(queryVo);
            //向list中填充静态数据
            model.addAttribute("itemsList", list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "items/itemsList";
    }

    @RequestMapping(value = "/editPage")
    public String editPage(Integer id, Model model) {
        try {
            ItemsCustom itemsCustom = itemsService.findItemsById(id);
            model.addAttribute("itemsCustom", itemsCustom);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "items/editItems";
    }

    @RequestMapping(value = "/savePage")
    public String savePage(Integer id,ItemsCustom itemsCustom) {
        try {
            itemsService.updateByItems(id, itemsCustom);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "success";
    }
}
