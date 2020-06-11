package com.kjxy.onlineshop.service.impl;


import com.kjxy.onlineshop.mapper.CartMapper;
import com.kjxy.onlineshop.pojo.Cart;
import com.kjxy.onlineshop.service.CartService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    @Resource
    private CartMapper cartMapper;

    @Override
    public List<Cart> getCartListByUserId(Integer userId) {
        return cartMapper.getCartListByUserId(userId);
    }
}
