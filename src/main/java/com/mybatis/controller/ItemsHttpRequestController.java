package com.mybatis.controller;

import com.google.common.collect.Lists;
import com.mybatis.po.Items;
import org.springframework.web.HttpRequestHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * <p></p>
 *
 * @author Andy
 * @date 2017/8/7
 */
public class ItemsHttpRequestController implements HttpRequestHandler {

    @Override
    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //调用service查找 数据库，查询商品列表，这里使用静态数据模拟
        List<Items> list = Lists.newArrayList();
        //向list中填充静态数据

        Items items1 = new Items();
        items1.setName("联想笔记本");
        items1.setPrice(6000f);
        items1.setDetail("ThinkPad T430 联想笔记本电脑！");

        Items items2 = new Items();
        items2.setName("苹果笔记本");
        items2.setPrice(14000f);
        items2.setDetail("2017款 灰色苹果笔记本电脑，配置core:i7,内存：8G 硬盘：512G");
        list.add(items1);
        list.add(items2);
        request.setAttribute("itemsList", list);

        request.getRequestDispatcher("/WEB-INF/view/items/itemsList.jsp").forward(request, response);
    }
}
