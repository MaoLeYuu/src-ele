package com.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.pojo.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Author: 夜雨听风
 * @Date: 2019-06-04 20:28
 * @Version 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    //登录
    @RequestMapping(value = "/login")
    public User login(@RequestParam String userName, @RequestParam String password,HttpServletResponse response){
        response.addHeader("Access-Control-Allow-Origin","*");
        System.out.println(userName + "...." + password);
        User user = userService.login(userName,password);
        return user;
    }
   /* public String login(HttpServletRequest request, HttpServletResponse response, HttpSession session){
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        //对密码进行加密，采用MD5算法，先不做
        User user=userService.login(username,password);
        //判断用户是否成功登陆
        if (user!=null){
            //登陆成功
            //判断用户是否勾选了自动登录
            String autoLogin=request.getParameter("autoLogin");
            if ("true".equals(autoLogin)){
                //需要自动登录
                Cookie cookie_username=new Cookie("cookie_username",user.getUserName());
                Cookie cookie_password=new Cookie("cookie_password",user.getUserPassword());
                cookie_password.setMaxAge(10*60);

                response.addCookie(cookie_username);
                response.addCookie(cookie_password);
            }
            session.setAttribute("user",user);
            return "redirect:"+request.getContextPath()+"/index.jsp";
        }else {
            request.setAttribute("loginError","用户名或密码错误");
            return "redirect:/login.jsp";
        }

    }*/

    //退出登录
    @RequestMapping(value = "/logout")
    public String logout(HttpSession session){
        session.removeAttribute("user");
        return "redirect:/index";
    }

    @RequestMapping(value = "test/{username}/{password}",method = RequestMethod.GET)
    public User is_Exit(@PathVariable String username,@PathVariable String password){
        return userService.findMsgById(username,password);
    }

    @RequestMapping(value = "test2/{id}")
    public User findUser(@PathVariable Integer id){
        return userService.findUser(id);
    }


   @RequestMapping("/register")
    public String insertUser(HttpServletRequest request, HttpServletResponse response ,
                             @RequestParam String userName,@RequestParam String password){
        response.addHeader("Access-Control-Allow-Origin","*");
       /* if(userName != null && password != null){
            return "success";
        }
        return "fail";*/
       System.out.println(userName);
       System.out.println(password);
        if(userService.getUserByName(userName) == null){
            User user = new User();
            user.setUserName(userName);
            user.setUserPassword(password);
            System.out.println(user);
            userService.insertUser(user);
            return "success";
        }
        return "fail";
    }
}
