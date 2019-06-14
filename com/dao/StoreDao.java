package com.dao;

import com.pojo.Store;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StoreDao {
     Integer getTotal();
     Integer insert(@Param("store") Store store);
     Integer update(@Param("store") Store store);
     Integer delete(@Param("id") int id);
     Store getStoreById(@Param("id") int id);
     List<Store> getList(@Param("start") int start, @Param("count") int count);
     List<Store> getStoreListByCategoryId(@Param("categoryId") int categoryId);
     List<Store> getStoreByStoreName(@Param("storeName") String storeName);
     Float getStoreShoppingFee(@Param("storeId") int storeId);
     Integer getStoreTime(@Param("storeId") int storeId);
}
