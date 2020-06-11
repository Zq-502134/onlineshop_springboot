package com.kjxy.onlineshop.controller;


import com.kjxy.onlineshop.pojo.User;
import com.kjxy.onlineshop.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;


@Controller
@ResponseBody
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;
   /* @RequestMapping(value = "/login")
    public User login(@RequestParam("username")String username, @RequestParam("pwd")String password){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        return userService.login(user);
    }*/
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public User login(@RequestBody User user){
      /*  User return_user = userService.login(user);
//        System.out.println(user.getUsername());
        if (return_user!=null){
            return_user.setStatus("success");
            return return_user;
        }
        return null;*/
        return userService.login(user);
    }
   /* public RespBean login(@RequestBody User user){
        if(userService.login(user)==1){
            return new RespBean("success","成功登录");
        }else {
            return new RespBean("error","信息错误，请重新输入");
        }
    }*/
}
