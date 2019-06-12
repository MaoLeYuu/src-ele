package com.controller;


import com.pojo.User;
import com.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;

/**
 * @Author: 夜雨听风
 * @Date: 2019-06-04 20:54
 * @Version 1.0
 */
@RestController
@RequestMapping("/register")
public class RegisterController {
    @Autowired
    private RegisterService registerService;

    @RequestMapping(value = "/get",method = RequestMethod.POST)
    public String doRegister(HttpServletRequest request, HttpSession session) throws UnsupportedEncodingException{
         request.setCharacterEncoding("UTF-8");
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        String password2=request.getParameter("password2");
        String isSuper=request.getParameter("isSuper");
        String telephone=request.getParameter("telephone");
        String address=request.getParameter("address");
        if (password.equals(password2)){
            if (registerUser(username)){
                User user1=new User();
                user1.setUserName(username);
                user1.setUserPassword(password);
                user1.setUserIsSuper(Integer.parseInt(isSuper));
                user1.setUserTelephone(telephone);
                user1.setUserDefaultAddress(Integer.parseInt(address));
                registerService.save(user1);
                return "redirect:/login";
            }
            else {
                return "redirect:/register";
            }
      }
            return "redirect:/register";
    }

    //判断用户是否已经注册过了
    public boolean registerUser(String username){

        if (registerService.findByName(username))
            return false;
        return true;
    }

}

