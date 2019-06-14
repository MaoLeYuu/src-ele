package com.dao;

import com.pojo.OrderItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderItemDao {
    Integer insert(@Param("orderItem") OrderItem orderItem);
    List<OrderItem> getOrderItemByOrderId(@Param("orderId") int orderId);
}
