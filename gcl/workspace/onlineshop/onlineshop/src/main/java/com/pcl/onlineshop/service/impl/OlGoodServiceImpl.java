package com.pcl.onlineshop.service.impl;

import com.pcl.onlineshop.config.exception.OlRuntimeException;
import com.pcl.onlineshop.config.tool.OlBeanUtils;
import com.pcl.onlineshop.dao.OlGoodMapper;
import com.pcl.onlineshop.dto.GoodDto;
import com.pcl.onlineshop.dto.GoodImage;
import com.pcl.onlineshop.dto.entity.GoodEntity;
import com.pcl.onlineshop.dto.entity.GoodImageEntity;
import com.pcl.onlineshop.service.OlGoodService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import java.util.List;

import static com.pcl.onlineshop.config.olenum.ErrorEnum.*;

@Service
public class OlGoodServiceImpl implements OlGoodService {

    @Autowired
    OlGoodMapper olGoodMapper;


    private static final Logger logger = LogManager.getLogger(OlGoodServiceImpl.class);

    @Override
    public GoodDto queryGoodDetailById(Integer goodId) {

        if (ObjectUtils.isEmpty(goodId)){
            throw new OlRuntimeException(Ol_USER_ERROR_0701);
        }

        GoodDto goodDto = OlBeanUtils.createCopy(olGoodMapper.selectGoodsDetails(goodId),GoodDto.class);
        if (ObjectUtils.isEmpty(goodDto)){
            throw new OlRuntimeException(Ol_USER_ERROR_0702);
        }

        List<GoodImageEntity> goodImageEntities = olGoodMapper.selectGoodsImages(goodDto.getId());

        if (CollectionUtils.isEmpty(goodImageEntities)){
            logger.warn(Ol_USER_WARNING_0701);
        }

        goodDto.setGoodImageList( OlBeanUtils.createCopy(goodImageEntities, GoodImage.class));

        return goodDto;
    }
}
