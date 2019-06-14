package com.service.serviceImp;

import com.dao.StoreDao;
import com.pojo.Store;
import com.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StoreServiceImpl implements StoreService {
    @Autowired
    private StoreDao storeDao;

    @Override
    public List<Store> getAllStore() {
        return storeDao.getList(0,Integer.MAX_VALUE);
    }

    @Override
    public List<Store> getStoreByCategoryId(int categoryId) {
        return storeDao.getStoreListByCategoryId(categoryId);
    }

    @Override
    public List<Store> getStoreByStoreName(String storeName) {
        return storeDao.getStoreByStoreName(storeName);
    }

    @Override
    public Float getStoreShoppingFee(int storeId) {
        return storeDao.getStoreShoppingFee(storeId);
    }

    @Override
    public Integer getStoreTime(int storeId) {
        return storeDao.getStoreTime(storeId);
    }
}
