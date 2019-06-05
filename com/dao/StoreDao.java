package com.dao;

import com.pojo.Store;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StoreDao {
    public Integer getTotal();
    public Integer insert(@Param("store") Store store);
    public Integer update(@Param("store") Store store);
    public Integer delete(@Param("id") int id);
    public Store getStoreById(@Param("id") int id);
    public List<Store> getList(@Param("start") int start, @Param("count") int count);
    public List<Store> getStoreListByCategoryId(@Param("categoryId") int categoryId);
}
