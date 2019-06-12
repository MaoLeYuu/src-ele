package com.dao;


import com.pojo.User;
import org.springframework.stereotype.Repository;

/**
 * @Author: 夜雨听风
 * @Date: 2019-06-04 21:18
 * @Version 1.0
 */
@Repository
public interface RegisterDao {

    User findByName(String username);

    void save(User user1);
}
