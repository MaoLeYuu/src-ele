package com.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ProductCommentDao {

    List<Map<String,Object>> getComment(Map param);
    int getCommentCount(Map param);

    List<Map<String ,Object>> search(Map param);
    int getTotalSearch(Map map);

    List<Map<String,Object>> getHighComment(Map param);
    int getHighCommentCount(Map Param);

    List<Map<String,Object>> getLowComment(Map param);
    int getLowCommentCount(Map Param);

    List<Map<String,Object>> getCommentOne(int storeId);
}
