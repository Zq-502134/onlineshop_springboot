package com.kjxy.onlineshop.controller;



import com.kjxy.onlineshop.pojo.Order;
import com.kjxy.onlineshop.service.OrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Resource
    private OrderService orderService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    List<Order> getOrderList(@RequestParam("userid") Integer userId) {
        return orderService.getOrderList(userId);
    }

    @RequestMapping(value = "/unionlist", method = RequestMethod.GET)
    List<Order> getOrderUnionList(@RequestParam("orderid") Integer orderId) {
        return orderService.getOrderUnionList(orderId);
    }

    @RequestMapping(value = "/unionlistByUserId", method = RequestMethod.GET)
    private List<Order> getUnionOrderListByUserId(@RequestParam("userid") Integer userId) {
        return orderService.getOrderUnionListByUserId(userId);
    }
}
