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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

import static com.pcl.onlineshop.config.olenum.ErrorEnum.*;

@Service
public class OlGoodServiceImpl implements OlGoodService {

    @Autowired
    OlGoodMapper olGoodMapper;

//    @Override
//    public GoodsDto changeGoodCondition(Integer goodId, Boolean change) {
//
//        String goodCondition = olGoodMapper.selectGoodCondition(goodId);
//
//        if (change == true){
//            switch(goodCondition)
//            {
//                case "賣家已出貨":
//                    olGoodMapper.changeGoodCondition(goodId,"商品運送中");
//                    break;
//                case "商品運送中":
//                    olGoodMapper.changeGoodCondition(goodId,"已抵達門市");
//                    break;
//                case "已抵達門市":
//                    olGoodMapper.changeGoodCondition(goodId,"取貨成功");
//                    break;
//                case "取貨成功" :
//                    throw new OlRuntimeException(ErrorEnum.Ol_USER_ERROR_1601);
//            }
//        }
//        return null;
//    }
    private static final Logger logger = LogManager.getLogger(OlGoodServiceImpl.class);

    public List<GoodDto> getAllGoods() {
        List<GoodEntity> goodEntities = olGoodMapper.getAllGoods();
        List<GoodDto> goodDtos = new ArrayList<>();

        for (GoodEntity goodEntity : goodEntities) {
            GoodDto goodDto = OlBeanUtils.createCopy(goodEntity, GoodDto.class);
            List<GoodImage> goodImages
                    = OlBeanUtils.createCopy(olGoodMapper.selectGoodsImages(goodDto.getId()),
                    GoodImage.class);

            if (!goodImages.isEmpty()) {
                goodDto.setGoodImageList(goodImages);
            }
            goodDtos.add(goodDto);
        }
        return goodDtos;
    }

    @Override
    public Boolean changeGoodCondition(Integer goodId, String status) {

        if (ObjectUtils.isEmpty(goodId)) {
            throw new OlRuntimeException(Ol_USER_ERROR_0701);
        }
        if (StringUtils.isEmpty(status)) {
            throw new OlRuntimeException(Ol_USER_ERROR_0701);
        }
        Integer goodCount = olGoodMapper.selectGoodCondition(goodId);

        if (ObjectUtils.isEmpty(goodCount) || goodCount == 0) {
            throw new OlRuntimeException(Ol_USER_ERROR_0702);
        }

        Integer updateCount = olGoodMapper.changeGoodCondition(goodId, status);

        if (ObjectUtils.isEmpty(updateCount) || updateCount == 0) {
            throw new OlRuntimeException(Ol_USER_ERROR_0901);
        }

        return true;
    }


    @Override
    public GoodDto queryGoodDetailById(Integer goodId) {

        if (ObjectUtils.isEmpty(goodId)) {
            throw new OlRuntimeException(Ol_USER_ERROR_0701);
        }

        GoodDto goodDto = OlBeanUtils.createCopy(olGoodMapper.selectGoodsDetails(goodId), GoodDto.class);
        if (ObjectUtils.isEmpty(goodDto)) {
            throw new OlRuntimeException(Ol_USER_ERROR_0702);
        }

        List<GoodImageEntity> goodImageEntities = olGoodMapper.selectGoodsImages(goodDto.getId());

        if (CollectionUtils.isEmpty(goodImageEntities)) {
            logger.warn(Ol_USER_WARNING_0701);
        }

        goodDto.setGoodImageList(OlBeanUtils.createCopy(goodImageEntities, GoodImage.class));

        return goodDto;
    }
}
