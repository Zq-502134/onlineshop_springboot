package com.kjxy.onlineshop.controller;


import com.kjxy.onlineshop.pojo.Cart;
import com.kjxy.onlineshop.service.CartService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {
    @Resource
    private CartService cartService;
    @RequestMapping("/list")
    public List<Cart> getCartList(@RequestParam("userId") Integer userId){
        return cartService.getCartListByUserId(userId);
    }
}
