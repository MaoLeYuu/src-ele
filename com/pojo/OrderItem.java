package com.pojo;

import java.io.Serializable;

/**
 * @Author: 夜雨听风
 * @Date: 2019-06-03 17:05
 * @Version 1.0
 */
//订单信息的实体类
public class OrderItem implements Serializable {
    private int orderItemId;
    //对应的order的id
    private int ordersId;
    private int productId;
    private int count;

    public OrderItem() {
    }

    public OrderItem(int orderItemId, int ordersId, int productId, int count) {
        this.orderItemId = orderItemId;
        this.ordersId = ordersId;
        this.productId = productId;
        this.count = count;
    }

    public int getOrderItem_id() {
        return orderItemId;
    }

    public void setOrderItem_id(int orderItemId) {
        this.orderItemId = orderItemId;
    }

    public int getOrders_id() {
        return ordersId;
    }

    public void setOrders_id(int ordersId) {
        this.ordersId = ordersId;
    }

    public int getProduct_id() {
        return productId;
    }

    public void setProduct_id(int productId) {
        this.productId = productId;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "orderItemId=" + orderItemId +
                ", ordersId=" + ordersId +
                ", productId=" + productId +
                ", count=" + count +
                '}';
    }
}
