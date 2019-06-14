package com.controller.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class OrderBean implements Serializable {
    private int ordersId;
    private long Pnum;
    private Date date;
    private String orderPhone;
    private String storePhone;
    private String ordersName;
    private String address;
    private String storeName;
    private double subTotal;
    private String src;
    private int status;
    private List<Map<String,Object>> list;

    public OrderBean() {
    }

    public OrderBean(int ordersId, long pnum, Date date, String orderPhone, String storePhone, String ordersName, String address, String storeName, double subTotal, String src, int status, List<Map<String, Object>> list) {
        this.ordersId = ordersId;
        Pnum = pnum;
        this.date = date;
        this.orderPhone = orderPhone;
        this.storePhone = storePhone;
        this.ordersName = ordersName;
        this.address = address;
        this.storeName = storeName;
        this.subTotal = subTotal;
        this.src = src;
        this.status = status;
        this.list = list;
    }

    public int getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(int ordersId) {
        this.ordersId = ordersId;
    }

    public long getPnum() {
        return Pnum;
    }

    public void setPnum(long pnum) {
        Pnum = pnum;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getOrderPhone() {
        return orderPhone;
    }

    public void setOrderPhone(String orderPhone) {
        this.orderPhone = orderPhone;
    }

    public String getStorePhone() {
        return storePhone;
    }

    public void setStorePhone(String storePhone) {
        this.storePhone = storePhone;
    }

    public String getOrdersName() {
        return ordersName;
    }

    public void setOrdersName(String ordersName) {
        this.ordersName = ordersName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<Map<String, Object>> getList() {
        return list;
    }

    public void setList(List<Map<String, Object>> list) {
        this.list = list;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    @Override
    public String toString() {
        return "OrderBean{" +
                "ordersId=" + ordersId +
                ", Pnum=" + Pnum +
                ", date=" + date +
                ", orderPhone='" + orderPhone + '\'' +
                ", storePhone='" + storePhone + '\'' +
                ", ordersName='" + ordersName + '\'' +
                ", address='" + address + '\'' +
                ", storeName='" + storeName + '\'' +
                ", subTotal=" + subTotal +
                ", src='" + src + '\'' +
                ", status=" + status +
                ", list=" + list +
                '}';
    }
}
