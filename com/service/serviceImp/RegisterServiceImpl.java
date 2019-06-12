package com.service.serviceImp;

import com.dao.RegisterDao;
import com.pojo.User;
import com.service.RegisterService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @Author: 夜雨听风
 * @Date: 2019-06-04 21:17
 * @Version 1.0
 */
@Service("registerService")
public class RegisterServiceImpl implements RegisterService {
    @Autowired
    private RegisterDao registerDao;

    public boolean findByName(String username) {
        User user= registerDao.findByName(username);
        if (user==null)
            return false;
        return true;
    }

    @Override
    public void save(User user1) {
        registerDao.save(user1);

    }
}

