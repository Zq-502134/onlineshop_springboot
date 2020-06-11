package com.kjxy.onlineshop.service;



import com.kjxy.onlineshop.pojo.Cart;

import java.util.List;

public interface CartService {
    List<Cart> getCartListByUserId(Integer userId);
}
