package com.dao;

import com.pojo.StoreComment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StoreCommentDao {
    Integer getStoreCommentByStoreId(@Param("storeId") int storeId);
}
