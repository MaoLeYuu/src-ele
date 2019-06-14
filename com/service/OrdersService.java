package com.service;

import com.controller.beans.OrderBean;
import com.pojo.Orders;

import java.util.List;

public interface OrdersService {
    Integer insert(Orders orders);
    List<Orders> getOrdersByUserId(int userId);
    List<OrderBean> getLateOrder(int userId);
    List<OrderBean> getOrder(int userId,int orderId);
}
