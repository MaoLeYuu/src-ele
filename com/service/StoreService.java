package com.service;

import com.pojo.Store;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StoreService {
    public List<Store> getAllStore();
    public List<Store> getStoreByCategoryId(int categoryId);
    List<Store> getStoreByStoreName(String storeName);
    Float getStoreShoppingFee(int storeId);
    Integer getStoreTime(int storeId);
}
