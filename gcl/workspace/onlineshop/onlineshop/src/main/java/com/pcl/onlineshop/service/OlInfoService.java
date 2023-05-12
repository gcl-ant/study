package com.pcl.onlineshop.service;

import com.pcl.onlineshop.dto.InfoDto;

import java.util.List;

public interface OlInfoService {

    List<InfoDto> queryInfoByUserID(Integer userId);


    Integer delInfoById(Integer infoId);

    InfoDto queryInfoById(Integer valueOf);
}
