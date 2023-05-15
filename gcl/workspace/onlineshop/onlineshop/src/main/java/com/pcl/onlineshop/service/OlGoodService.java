package com.pcl.onlineshop.service;


import com.pcl.onlineshop.dto.GoodDto;
import com.pcl.onlineshop.dto.GoodsDto;

import java.util.List;

public interface OlGoodService {

    GoodDto queryGoodDetailById(Integer goodId);

    List<GoodDto> getAllGoods();


    Boolean changeGoodCondition(Integer goodId, String status);

    Integer AddComment(String content, Integer tranId, String commentRate);
}
