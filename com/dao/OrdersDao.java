package com.dao;

import com.pojo.Orders;
import org.apache.ibatis.annotations.Lang;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface OrdersDao {
    Integer insert(@Param("orders") Orders orders);
    List<Orders> getOrdersByUserId(@Param("userId") int userId);
    List<Map<String,Object>> getMonthsThree(@Param("userId") int userId);
    List<Map<String,Object>> getOrders(@Param("userId") int userId,@Param("ordersId") int ordersId);
}
