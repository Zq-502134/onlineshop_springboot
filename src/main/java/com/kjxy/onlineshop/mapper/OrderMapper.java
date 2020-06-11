package com.kjxy.onlineshop.mapper;

import com.kjxy.onlineshop.pojo.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {
    int deleteByPrimaryKey(Integer orderid);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer orderid);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    List<Order> getOrderUnionListByUserId(Integer userId);

    List<Order> getOrderList(Integer userId);

    List<Order> getOrderUnionList(Integer orderId);
}