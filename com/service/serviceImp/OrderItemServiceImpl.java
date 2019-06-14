package com.service.serviceImp;

import com.dao.OrderItemDao;
import com.pojo.OrderItem;
import com.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderItemServiceImpl implements OrderItemService {
    @Autowired
    private OrderItemDao orderItemDao;
    @Override
    public Integer insert(OrderItem orderItem) {
        return orderItemDao.insert(orderItem);
    }

    @Override
    public List<OrderItem> getOrderItem(int ordersId) {
        return orderItemDao.getOrderItemByOrderId(ordersId);
    }
}
