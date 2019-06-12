package com.service;


import com.pojo.User;

/**
 * @Author: 夜雨听风
 * @Date: 2019-06-04 20:29
 * @Version 1.0
 */
public interface UserService {
    User login(String username, String password);

    User findMsgById(String username, String password);

    User findUser(Integer id);

    Integer insertUser(User user);

    User getUserByName(String userName);
}
