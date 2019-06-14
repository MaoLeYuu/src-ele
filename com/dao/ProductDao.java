package com.dao;

import com.pojo.OrderItem;
import com.pojo.Orders;
import com.pojo.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ProductDao {
   List<Map<String,Object>> getProduct(int storeId);
  /* int getProductCount(Map map);*/
   List<Map<String,Object>> getSortMark(int storeId);
 /*  int getSortMarkCount(Map param);*/
   List<Map<String,Object>> getSortPrice(int storeId);
  /* int getSortPriceCount(Map map);*/
   List<Map<String,Object>> getOrder(int storeId);
  /* int getOrderCount(Map map);*/
   Product getProductById(int pid);
   void addOrders(Orders order);
   void addOrderItem(OrderItem orderItem);
   List<OrderItem> getAllOrderItem();
   List<Integer> getProductIdByStoreId(@Param("storeId") int storeId);

}
