package com.dao;

import com.pojo.Category;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CategoryDao {
     Integer getTotal();
     Integer insert(@Param("category") Category category);
     Integer update(@Param("category") Category category);
     Integer delete(@Param("id") int id);
     Category getCategoryById(@Param("id") int id);
     List<Category> getList(@Param("start") int start, @Param("count") int count);

}
