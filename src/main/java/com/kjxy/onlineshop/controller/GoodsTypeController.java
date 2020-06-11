package com.kjxy.onlineshop.controller;

import com.kjxy.onlineshop.pojo.GoodsType;
import com.kjxy.onlineshop.service.GoodsTypeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/goodsType")
public class GoodsTypeController {

    @Resource
    private GoodsTypeService goodsTypeService;
    @RequestMapping("/list")
    public List<GoodsType> getGoodsTypeList(){
        return goodsTypeService.getGoodsTypeList();
    }
}
