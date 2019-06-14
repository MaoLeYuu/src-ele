package com.service;

import com.pojo.OrderItem;

import java.util.List;

public interface OrderItemService {
    Integer insert(OrderItem orderItem);
    List<OrderItem> getOrderItem(int ordersId);

}
