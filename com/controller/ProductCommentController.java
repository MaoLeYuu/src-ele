package com.controller;

import com.controller.result.One;
import com.controller.result.ProductOne;
import com.controller.result.productCommentBean;
import com.service.ProductCommentService;
import com.utils.PageResult;
import com.utils.PageUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/comment")
public class ProductCommentController {
    private List<Map<String,Object>> data;

    @Resource(name = "productCommentService")
    private ProductCommentService productCommentService;

    @RequestMapping("/get")
    public List<ProductOne>  get(@RequestParam int id, HttpServletResponse response){
        List<ProductOne> productOneList = new ArrayList<>();

        response.addHeader("Access-Control-Allow-Origin","*");
        getAll(id,productOneList);
        if (!productOneList.isEmpty()){
            /*List<One> oneList = new ArrayList<>();
            productCommentBean pcbean = new productCommentBean();
            ProductOne productOne = productOneList.get(0);
            String name = productOne.getProductName();
            for (ProductOne p:productOneList
                 ) {
                    if(p.getUserName().equals(name)){
                       String userName = p.getUserName();
                       String
                    }
            }*/
            return productOneList;
        }
        return productOneList;

    }

    @RequestMapping("/list")
    public PageResult list(@RequestParam Map<String,Object> map,HttpServletResponse response){
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

    public void getAll(int id,List<ProductOne> list){
        data = productCommentService.comment(id);
        for (Map<String,Object> map:data
        ) {
            String userName = (String) map.get("userName");
            String productName = (String) map.get("productName");
            String pComment = (String) map.get("Pcomment");
            Date date = (Date) map.get("date");
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            String datetime=sdf.format(date);

            ProductOne productOne = new ProductOne();
            productOne.setUserName(userName);
            productOne.setpComment(pComment);
            productOne.setDate(datetime);
            productOne.setProductName(productName);
            list.add(productOne);
        }

    }

}
