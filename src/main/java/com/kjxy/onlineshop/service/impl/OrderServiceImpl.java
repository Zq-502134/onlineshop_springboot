package com.kjxy.onlineshop.service.impl;


import com.kjxy.onlineshop.mapper.OrderMapper;
import com.kjxy.onlineshop.pojo.Order;
import com.kjxy.onlineshop.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderServiceImpl  implements OrderService {
    @Resource
    private OrderMapper orderMapper;

    @Override
    public List<Order> getOrderList(Integer userId) {
        return orderMapper.getOrderList(userId);
    }

    @Override
    public List<Order> getOrderUnionList(Integer orderId) {
        return orderMapper.getOrderUnionList(orderId);
    }

    @Override
    public List<Order> getOrderUnionListByUserId(Integer userId) {
        return orderMapper.getOrderUnionListByUserId(userId);
    }
}
