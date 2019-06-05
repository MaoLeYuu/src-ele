package com.dao;

import com.pojo.Category;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CategoryDao {
    public Integer getTotal();
    public Integer insert(@Param("category") Category category);
    public Integer update(@Param("category") Category category);
    public Integer delete(@Param("id") int id);
    public Category getCategoryById(@Param("id") int id);
    public List<Category> getList(@Param("start") int start, @Param("count") int count);
}
