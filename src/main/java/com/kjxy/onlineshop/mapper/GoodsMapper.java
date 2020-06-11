package com.kjxy.onlineshop.mapper;

import com.kjxy.onlineshop.pojo.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface GoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);

    List<Goods> getGoodsListByContions(Map<String, Object> goodsMap);

    int getCount(Map<String, Object> goodsMap);

    int updateState(Map<String, Object> stateMap);
}