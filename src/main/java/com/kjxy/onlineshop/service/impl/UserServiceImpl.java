package com.kjxy.onlineshop.service.impl;


import com.kjxy.onlineshop.mapper.UserMapper;
import com.kjxy.onlineshop.pojo.User;
import com.kjxy.onlineshop.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public User login(User user) {
        /*if(userMapper.selectByUser(user) != null)
            return 1;
        else
            return 0;*/
        return userMapper.selectByUser(user);
    }
}
