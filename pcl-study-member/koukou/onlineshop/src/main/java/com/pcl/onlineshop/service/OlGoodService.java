package com.pcl.onlineshop.service;

import com.pcl.onlineshop.dto.GoodDto;
import java.util.List;

public interface OlGoodService {

    GoodDto queryGoodDetailById(Integer goodId);

    List<GoodDto> getAllGoods();

    Boolean changeGoodCondition(Integer goodId, String status);
}
