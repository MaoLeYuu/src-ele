package  com.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
    private int status;
    private double total;
    private String userAddress;
    private String userTelephone;
    private String orderName;
    //订单属于那个用户
    private User user;
    //订单的订单项
    List<OrderItem> orderItems=new ArrayList<OrderItem>();

    public List<OrderItem> getOrderItems() {

        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getTotal() {
        return total;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserTelephone() {
        return userTelephone;
    }

    public void setUserTelephone(String userTelephone) {
        this.userTelephone = userTelephone;
    }

    //订单的状态
    private enum ordersStatus{
        SUCCESSED,FAILED_
    }


    public Orders() {
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
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

    public Date getOrders_date(Date date) {
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
