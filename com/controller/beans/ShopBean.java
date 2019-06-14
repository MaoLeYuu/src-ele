package com.controller.beans;

import java.util.List;
import java.util.Map;

public class ShopBean {
    private int storeId;
    private List<Map<Integer,Integer>> mao;
    private String address;


    public ShopBean() {
    }



    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public ShopBean(int storeId, List<Map<Integer, Integer>> mao, String address) {
        this.storeId = storeId;
        this.mao = mao;
        this.address = address;
    }

    public List<Map<Integer, Integer>> getMao() {
        return mao;
    }

    public void setMao(List<Map<Integer, Integer>> mao) {
        this.mao = mao;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
