package com.controller;

import com.pojo.Category;
import com.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class CategoryController {
    @Resource(name = "categoryServiceImp")
    private CategoryService categoryService;

    @RequestMapping("/getIndex")
    public List<Category> getAll(){
        return categoryService.getAll();
    }
    @RequestMapping("/get")
    public Category getOne(int id){
        //id = 1;
        System.out.println(categoryService.getOne(id));
        return categoryService.getOne(id);
    }
}
