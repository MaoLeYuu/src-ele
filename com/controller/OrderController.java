package com.controller;

import com.controller.beans.OrderBean;
import com.service.OrdersService;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping(value = "/order")
public class OrderController {
    @Resource(name = "ordersService")
    private OrdersService orderService;

    @RequestMapping(value = "/late")
    public List<OrderBean> late(@RequestParam int userId, HttpServletResponse response){
        response.addHeader("Access-Control-Allow-Origin","*");
        List<OrderBean> list=orderService.getLateOrder(userId);
        return list;
    }
    @RequestMapping(value = "/details")
    public List<OrderBean> details(@RequestParam int userId, @RequestParam int orderId,HttpServletResponse response){
        response.addHeader("Access-Control-Allow-Origin","*");
        List<OrderBean> list=orderService.getOrder(userId,orderId);
        return list;
    }
}
