package com.service.serviceImp;

import com.dao.StoreCommentDao;
import com.service.StoreCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreCommentServiceImpl implements StoreCommentService {
    @Autowired
    private StoreCommentDao storeCommentDao;

    @Override
    public Integer getCommentByStoreId(int id) {
        return storeCommentDao.getStoreCommentByStoreId(id);
    }
}
