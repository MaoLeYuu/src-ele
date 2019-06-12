package com.controller;


import com.alibaba.fastjson.JSONObject;
import com.pojo.Store;
import com.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

@RestController
@RequestMapping("/store")
public class StoreController {
    @Autowired
    StoreService storeService;

    @RequestMapping("/getStoreByName")
    public List<Store> getStoreByStoreName(@RequestParam String name,
                                           HttpServletRequest request, HttpServletResponse response){
        response.addHeader("Access-Control-Allow-Origin","*");
       // System.out.println(name);
        try {
            name = new String(name.getBytes("ISO8859-1"), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        //System.out.println(name);
        System.out.println(storeService.getStoreByStoreName(name));
        return storeService.getStoreByStoreName(name);
    }
}
