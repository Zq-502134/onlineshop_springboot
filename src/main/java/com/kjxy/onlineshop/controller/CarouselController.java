package com.kjxy.onlineshop.controller;


import com.kjxy.onlineshop.pojo.Carousel;
import com.kjxy.onlineshop.service.CarouselService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/carousel")
public class CarouselController {

    @Resource
    private CarouselService carouselService;

    @RequestMapping(value = "/getList",method = RequestMethod.GET)
    public List<Carousel> getCarouselList() {
        return carouselService.getCarouselList();
    }
}
