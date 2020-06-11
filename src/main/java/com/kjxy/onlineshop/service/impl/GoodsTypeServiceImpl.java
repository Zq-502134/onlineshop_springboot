package com.kjxy.onlineshop.service.impl;


import com.kjxy.onlineshop.mapper.GoodsTypeMapper;
import com.kjxy.onlineshop.pojo.GoodsType;
import com.kjxy.onlineshop.service.GoodsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsTypeServiceImpl implements GoodsTypeService {
   @Resource
   private GoodsTypeMapper goodsTypeMapper;

    @Override
    public List<GoodsType> getGoodsTypeList() {
        return goodsTypeMapper.getGoodsTypeList();
    }
}
