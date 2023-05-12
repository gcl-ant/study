package com.pcl.onlineshop.service;


import com.pcl.onlineshop.dto.GoodDto;

public interface OlGoodService {

    GoodDto queryGoodDetailById(Integer goodId);
}
