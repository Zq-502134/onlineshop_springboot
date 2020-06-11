package com.kjxy.onlineshop.service;



import com.kjxy.onlineshop.pojo.Order;

import java.util.List;

public interface OrderService {
    List<Order> getOrderList(Integer userId);

    List<Order> getOrderUnionList(Integer orderId);

    List<Order> getOrderUnionListByUserId(Integer userId);
}
