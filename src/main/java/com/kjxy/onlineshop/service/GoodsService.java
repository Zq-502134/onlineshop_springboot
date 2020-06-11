package com.kjxy.onlineshop.service;


import com.kjxy.onlineshop.pojo.Goods;

import java.util.List;
import java.util.Map;

public interface GoodsService {
    List<Goods> getGoodsListByContions(Map<String,Object> goodsMap);

//    List<Goods> getGoodsListByContions(Map<String,Object> goodsMap);

    int getCount(Map<String,Object> goodsMap);

    int saveGoods(Goods goods);

    int updateGoods(Goods goods);

    int updateState(Map<String,Object> stateMap);

    Goods selectByPrimaryKey(Integer id);
}
