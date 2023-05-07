package com.pcl.onlineshop.service.impl;

import com.pcl.onlineshop.config.exception.OlRuntimeException;
import com.pcl.onlineshop.config.tool.OlBeanUtils;
import com.pcl.onlineshop.dao.OlInfo2UserMapper;
import com.pcl.onlineshop.dao.OlInfoMapper;
import com.pcl.onlineshop.dto.InfoDto;
import com.pcl.onlineshop.service.OlInfoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;

import static com.pcl.onlineshop.config.olenum.ErrorEnum.Ol_USER_ERROR_1701;
import static com.pcl.onlineshop.config.olenum.ErrorEnum.Ol_USER_ERROR_1702;

@Service
public class OlInfoServiceImpl implements OlInfoService {

    @Autowired
    OlInfoMapper olInfoMapper;

    @Autowired
    OlInfo2UserMapper olInfo2UserMapper;

    @Override
    public List<InfoDto> queryInfoByUserID(Integer userId) {
        return  OlBeanUtils.createCopy(olInfoMapper.selectPrInfo(userId),InfoDto.class);
    }

    @Override
    public Integer delInfoById(Integer infoId) {

        if (ObjectUtils.isEmpty(infoId)){
            throw new OlRuntimeException(Ol_USER_ERROR_1701);
        }

        Integer count = olInfoMapper.delInfoById(infoId);

        if (ObjectUtils.isEmpty(count) || count == 0){
            throw new OlRuntimeException(Ol_USER_ERROR_1702);
        }

        olInfo2UserMapper.delInfoById(infoId);

        return 1;
    }


}
