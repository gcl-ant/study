package com.pcl.onlineshop.service.impl;

import com.pcl.onlineshop.config.exception.OlRuntimeException;
import com.pcl.onlineshop.config.olenum.ErrorEnum;
import com.pcl.onlineshop.config.tool.OlBeanUtils;
import com.pcl.onlineshop.dao.OlCommentMapper;
import com.pcl.onlineshop.dao.OlGoodMapper;
import com.pcl.onlineshop.dao.OlTranMapper;
import com.pcl.onlineshop.dto.GoodDto;
import com.pcl.onlineshop.dto.GoodImage;
import com.pcl.onlineshop.dto.GoodsDto;
import com.pcl.onlineshop.dto.entity.GoodEntity;
import com.pcl.onlineshop.dto.entity.GoodImageEntity;
import com.pcl.onlineshop.dto.entity.OlComment;
import com.pcl.onlineshop.service.OlGoodService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.pcl.onlineshop.config.olenum.ErrorEnum.*;

@Service
public class OlGoodServiceImpl implements OlGoodService {

    @Autowired
    OlGoodMapper olGoodMapper;

    @Autowired
    OlCommentMapper olCommentMapper;

    @Autowired
    OlTranMapper olTranMapper;

    private static final String COMMENT_DEFAULT_MESSAGE = "ユーザーが何も話しません";

    private static final List<String> COMMENT_DIVISION_LIST = Arrays.asList("1", "2");

    private static final Logger logger = LogManager.getLogger(OlGoodServiceImpl.class);

    @Override
    public Integer AddComment(String content, Integer tranId, String commentRate) {

        if (ObjectUtils.isEmpty(content)) {
            content = COMMENT_DEFAULT_MESSAGE;
        }

        if (ObjectUtils.isEmpty(tranId) || ObjectUtils.isEmpty(commentRate)) {
            logger.error(ErrorEnum.Ol_USER_ERROR_1001.getContent());
            throw new OlRuntimeException(Ol_USER_ERROR_1001);
        }

        if (content.length() <= 2) {
            logger.error(ErrorEnum.Ol_USER_ERROR_1002.getContent());
            throw new OlRuntimeException(Ol_USER_ERROR_1002);
        }

        if (!COMMENT_DIVISION_LIST.contains(commentRate)) {
            logger.error(ErrorEnum.Ol_USER_ERROR_1003.getContent());
            throw new OlRuntimeException(Ol_USER_ERROR_1003);
        }

        Integer tranIdCount = olTranMapper.queryTranIdExist(tranId);

        if (ObjectUtils.isEmpty(tranIdCount) || tranIdCount != 1) {
            logger.error(ErrorEnum.Ol_USER_ERROR_1004.getContent());
            throw new OlRuntimeException(Ol_USER_ERROR_1004);
        }

        OlComment comment = intiCommnet(content, tranId, commentRate);

        Integer result2 = olCommentMapper.addComment(comment);
        return result2;
    }


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


    private OlComment intiCommnet(String content, Integer tranId, String commentRate) {

        OlComment olComment = new OlComment();
        olComment.setContent(content);
        olComment.setTranId(tranId);
        olComment.setOlCommnetDivision(commentRate);

        return olComment ;
    }
}
