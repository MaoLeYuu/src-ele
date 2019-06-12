package com.controller;


import com.alibaba.fastjson.JSONObject;
import com.pojo.Category;
import com.pojo.Store;
import com.service.CategoryService;
import com.service.StoreCommentService;
import com.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class CategoryController {
    @Resource(name = "categoryServiceImpl")
    private CategoryService categoryService;

    @Autowired
    private StoreService storeService;

    @Autowired
    private StoreCommentService storeCommentService;

    @RequestMapping("/index")
    public JSONObject getIndex(HttpServletRequest request,HttpServletResponse response){
        response.addHeader("Access-Control-Allow-Origin","*");
        List<Category> list = new ArrayList<>();
        List<Category> categoryList = categoryService.getAll();

        JSONObject jsonObject = new JSONObject();
        for (Category category:categoryList
             ) {
            List<Store> storeList = storeService.getStoreByCategoryId(category.getCategoryId());
            for (Store store:storeList
                 ) {
                Integer storeComment = storeCommentService.getCommentByStoreId(store.getstoreId());
                store.setStoreComment(storeComment);
            }
            category.setStoreList(storeList);
            list.add(category);
        }
        jsonObject.put("data",list);
       return jsonObject;
}

    @RequestMapping("/getCategory")
    public Category getOne(int id, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println(categoryService.getOne(id));
       // System.out.println();
        return categoryService.getOne(id);
    }
}
