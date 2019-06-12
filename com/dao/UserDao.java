package com.dao;

import com.pojo.User;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


/**
 * @Author: 夜雨听风
 * @Date: 2019-06-04 20:36
 * @Version 1.0
 */
@Repository
public interface UserDao {
    User login(@Param("username") String username, @Param("password") String password);

    User findMsg(@Param("username") String username, @Param("password") String password);

    User fingUser(@Param("id") Integer id);

    Integer insert(@Param("user") User user);

    User getUserByName(@Param("userName") String userName);
}
