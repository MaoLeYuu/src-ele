package com.service.serviceImp;

import com.dao.ProductDao;
import com.pojo.OrderItem;
import com.pojo.Orders;
import com.pojo.Product;
import com.service.ProductService;
import com.utils.PageResult;
import com.utils.PageUtil;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("productService")
public class ProductServiceImpl implements ProductService {
    @Resource(name = "productDao")
    private ProductDao productDao;


    @Override
    public List<Map<String, Object>> getProductPage(int storeId) {
        return productDao.getProduct(storeId);
    }

    @Override
    public List<Map<String,Object>> getSortMarkPage(int storeId) {
        return productDao.getSortMark(storeId);
    }

    @Override
    public List<Map<String,Object>> getSortPricePage(int storeId) {
        return productDao.getSortPrice(storeId);
    }

    @Override
    public List<Map<String,Object>> getSortOrderPage(int storeId) {
        return getSortOrderPage(storeId);
    }

    public Product findProductByid(int pid) {
        return productDao.getProductById(pid);
    }
    //使用事物操作
    @Transactional
    public void submitOrder(Orders order) { System.out.println("ssss");
        productDao.addOrders(order);

        List<OrderItem> items=order.getOrderItems();
        for (OrderItem orderItem:items){
            productDao.addOrderItem(orderItem);
        }

    }

    public List<OrderItem> findAllOrderItem() {
        return productDao.getAllOrderItem();
    }
}
