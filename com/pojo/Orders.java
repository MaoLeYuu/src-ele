package com.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: 夜雨听风
 * @Date: 2019-06-03 17:07
 * @Version 1.0
 */
//订单的实体类
public class Orders implements Serializable {
    private int ordersId;
    private int userId;
    private int storeId;
    //下单时间
    private Date orders_date;
    //订单的状态
    private enum ordersStatus{
        SUCCESSED,FAILED_
    }

    public Orders() {
    }

    public Orders(int ordersId, int userId, int storeId, Date orders_date) {
        this.ordersId = ordersId;
        this.userId = userId;
        this.storeId = storeId;
        this.orders_date = orders_date;
    }

    public int getOrders_id() {
        return ordersId;
    }

    public void setOrders_id(int ordersId) {
        this.ordersId = ordersId;
    }

    public int getUser_id() {
        return userId;
    }

    public void setUser_id(int userId) {
        this.userId = userId;
    }

    public int getStore_id() {
        return storeId;
    }

    public void setStore_id(int storeId) {
        this.storeId = storeId;
    }

    public Date getOrders_date() {
        return orders_date;
    }

    public void setOrders_date(Date orders_date) {
        this.orders_date = orders_date;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "ordersId=" + ordersId +
                ", userId=" + userId +
                ", storeId=" + storeId +
                ", orders_date=" + orders_date +
                '}';
    }
}
