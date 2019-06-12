package com.service;


import com.pojo.User;

/**
 * @Author: 夜雨听风
 * @Date: 2019-06-04 21:16
 * @Version 1.0
 */
public interface RegisterService {
    boolean findByName(String username);

    void save(User user1);
}
