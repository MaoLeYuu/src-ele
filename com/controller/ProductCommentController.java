package com.controller;

import com.service.ProductCommentService;
import com.utils.PageResult;
import com.utils.PageUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/comment")
public class ProductCommentController {
    @Resource(name = "productCommentService")
    private ProductCommentService productCommentService;

    @RequestMapping("/get")
    public List<Map<String, Object>> get(@RequestParam int id){
       return productCommentService.comment(id);
    }

    @RequestMapping("/list")
    public PageResult list(@RequestParam Map<String,Object> map){
        PageUtil pageUtil=new PageUtil(map);
        return productCommentService.getComments(pageUtil);
    }
    @RequestMapping("/high")
    public PageResult high(@RequestParam Map<String,Object> map){
        PageUtil pageUtil=new PageUtil(map);
        return productCommentService.getHighCommentPage(pageUtil);
    }
    @RequestMapping("/search")
    public PageResult search(@RequestParam Map<String,Object> map){
        PageUtil pageUtil=new PageUtil(map);
        return productCommentService.getSreachPage(pageUtil);
    }

}
