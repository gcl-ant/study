package com.pcl.onlineshop.service.impl;

import com.pcl.onlineshop.config.tool.OlBeanUtils;
import com.pcl.onlineshop.dao.OlInfoMapper;
import com.pcl.onlineshop.dto.InfoDto;
import com.pcl.onlineshop.service.OlInfoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OlInfoServiceImpl implements OlInfoService {

    @Autowired
    OlInfoMapper olInfoMapper;

    @Override
    public List<InfoDto> queryInfoByUserID(Integer userId) {
        return  OlBeanUtils.createCopy(olInfoMapper.selectPrInfo(userId),InfoDto.class);
    }
}
