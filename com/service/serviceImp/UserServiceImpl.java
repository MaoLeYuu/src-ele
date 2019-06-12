package com.service.serviceImp;

import com.dao.UserDao;
import com.pojo.User;


import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




/**
 * @Author: 夜雨听风
 * @Date: 2019-06-04 20:30
 * @Version 1.0
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public User login(String username, String password) {
        return userDao.login(username,password);
    }

    public User findMsgById( String username, String password) {

        return userDao.findMsg(username,password);
    }

    public User findUser(Integer id) {
        return userDao.fingUser(id);
    }

    @Override
    public Integer insertUser(User user) {
        return userDao.insert(user);
    }

    @Override
    public User getUserByName(String userName) {
        return userDao.getUserByName(userName);
    }
}
