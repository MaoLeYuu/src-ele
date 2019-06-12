package com.controller;

import com.alibaba.fastjson.JSONObject;
import com.pojo.Address;
import com.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    private AddressService addressService;
    @RequestMapping("/add")
    public String insert(HttpServletRequest request, HttpServletResponse response, @RequestParam JSONObject json
                         /*@RequestParam int userId,@RequestParam String name,@RequestParam String gender,@RequestParam String teltphone,
                       @RequestParam String address,@RequestParam String detail*/ ){
        response.addHeader("Access-Control-Allow-Origin","*");
        Integer userId = json.getInteger("userId");
        String name = json.getString("name");
        String gender = json.getString("gender");
        String telephone = json.getString("telephone");
        String address = json.getString("address");
      //  String detail = json.getString("detail");
        Address add = new Address();
        add.setUser_id(userId);
        add.setName(name);
        add.setGender(gender);
        add.setTelephone(telephone);
        add.setAddress(address);
       // add.setDetailsAddress(detail);
        if(addressService.insertAddress(add) > 0){
            return "success";
        }
        return "fail";
    }
    @RequestMapping("/get")
    public List<Address> selectAddressByUserId(HttpServletRequest request,HttpServletResponse response,@RequestParam int userId){
        response.addHeader("Access-Control-Allow-Origin","*");
        List<Address> list = addressService.selectAddressByUserId(userId);
        System.out.println(list);
        return addressService.selectAddressByUserId(userId);
    }

    @RequestMapping("/update")
    public String updateAddress(HttpServletRequest request,HttpServletResponse response,@RequestParam JSONObject json){
        response.addHeader("Access-Control-Allow-Origin","*");
        Integer addressId = json.getInteger("addressId");
        Integer userId = json.getInteger("userId");
        String name = json.getString("name");
        String gender = json.getString("gender");
        String telephone = json.getString("telephone");
        String address = json.getString("address");
      //  String detail = json.getString("detail");
        Address add = new Address();
        add.setUser_id(userId);
        add.setName(name);
        add.setGender(gender);
        add.setTelephone(telephone);
        add.setAddress(address);
       // add.setDetailsAddress(detail);
        add.setAddress_id(addressId);
        if(addressService.updateAddress(add) > 0){
            return "success";
        }
        return "fail";
    }
    @RequestMapping("/delete")
    public String deleteAddress(HttpServletRequest request,HttpServletResponse response,@RequestParam int addressId){
        response.addHeader("Access-Control-Allow-Origin","*");
        if(addressService.deleteAddress(addressId) > 0){
            return "success";
        }
        return "fail";
    }
}
