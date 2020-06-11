package com.kjxy.onlineshop.service.impl;

import com.kjxy.onlineshop.mapper.CarouselMapper;
import com.kjxy.onlineshop.pojo.Carousel;
import com.kjxy.onlineshop.service.CarouselService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CarouselServiceImpl  implements CarouselService {

    @Resource
    private CarouselMapper carouselMapper;
    @Override
    public List<Carousel> getCarouselList() {
        return carouselMapper.getCarouselList();
    }
}
