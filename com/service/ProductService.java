package com.service;

import com.pojo.OrderItem;
import com.pojo.Orders;
import com.pojo.Product;
import com.utils.PageResult;
import com.utils.PageUtil;

import java.util.List;
import java.util.Map;


public interface ProductService {
   List<Map<String,Object>> getProductPage(int storeId);
   List<Map<String,Object>> getSortMarkPage(int storeId);
   List<Map<String,Object>> getSortPricePage(int storeId );
   List<Map<String,Object>> getSortOrderPage(int storeId );
   Product findProductByid(int pid);

   void submitOrder(Orders order);

   List<OrderItem> findAllOrderItem();
}
