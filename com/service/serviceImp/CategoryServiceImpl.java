package com.service.serviceImp;

import com.dao.CategoryDao;
import com.pojo.Category;
import com.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.annotation.Resources;
import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Resource(name = "categoryDao")
    private CategoryDao categoryDao;
    @Override
    public List<Category> getAll() {
       return categoryDao.getList(0,Integer.MAX_VALUE);
    }

    @Override
    public Category getOne(int id) {
        return categoryDao.getCategoryById(id);
    }


}
