package com.mybatis.controller;

import com.google.common.collect.Lists;
import com.mybatis.po.Items;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * <p></p>
 *
 * @author Andy
 * @date 2017/8/4
 */
public class ItemsController implements Controller {

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        //调用service查找 数据库，查询商品列表，这里使用静态数据模拟
        List<Items> list = Lists.newArrayList();
        //向list中填充静态数据

        Items items = new Items();
        items.setName("联想笔记本");
        items.setPrice(6000f);
        items.setDetail("ThinkPad T430 联想笔记本电脑！");
        list.add(items);

        //返回ModelAndView
        ModelAndView modelAndView =  new ModelAndView();
        modelAndView.addObject("itemsList", list);
        modelAndView.setViewName("/WEB-INF/view/items/itemsList.jsp");

        return modelAndView;
    }
}
