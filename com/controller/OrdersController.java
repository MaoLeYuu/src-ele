package com.controller;

import com.alibaba.fastjson.JSONObject;
import com.pojo.Orders;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.LinkedList;

@RestController
@RequestMapping("/orders")
public class OrdersController {
    @RequestMapping("/add")
    public String add(HttpServletResponse response, HttpServletRequest request){
        response.addHeader("Access-Control-Allow-Origin","*");
        return "success";
    }
}
