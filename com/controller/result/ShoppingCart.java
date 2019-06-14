package com.controller.result;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//记录每一个店铺的售出
public class ShoppingCart {
    private List<ShoppingBean> shoppingBeans;
    private String storeName;

    public  List<ShoppingBean> getShoppingBeans() {
        return shoppingBeans;
    }

    public void setShoppingBeans(List<ShoppingBean> shoppingBeans) {
        this.shoppingBeans = shoppingBeans;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
}
