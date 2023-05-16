package com.pcl.onlineshop.service.impl;

import com.pcl.onlineshop.config.exception.OlRuntimeException;
import com.pcl.onlineshop.config.olenum.ErrorEnum;
import com.pcl.onlineshop.config.tool.OlBeanUtils;
import com.pcl.onlineshop.dao.*;
import com.pcl.onlineshop.dto.GoodDto;
import com.pcl.onlineshop.dto.GoodImage;
import com.pcl.onlineshop.dto.GoodsDto;
import com.pcl.onlineshop.dto.entity.*;
import com.pcl.onlineshop.service.OlGoodService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
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

    @Autowired
    AccountOpeMapper accountOpeMapper;

    @Autowired
    AccountMapper accountMapper;

    private static final String COMMENT_DEFAULT_MESSAGE = "ユーザーが何も話しません";

    private static final List<String> COMMENT_DIVISION_LIST = Arrays.asList("1", "2");

    private static final Logger logger = LogManager.getLogger(OlGoodServiceImpl.class);


    @Override
    @Transactional
    public Integer returnGood(Integer orderId) {

        if (ObjectUtils.isEmpty(orderId)) {
            throw new OlRuntimeException(Ol_USER_ERROR_1001);
        }

        //用户退货开始  4是用户退货
        olTranMapper.updateOrderStatus(orderId,4,LocalDateTime.now(),"OlGoodServiceImpl.returnGood");

        OlTransEntity olTransEntity = olTranMapper.queryTranByEntityOrderId(orderId);
        if (ObjectUtils.isEmpty(olTransEntity)) {
            throw new OlRuntimeException(Ol_USER_ERROR_1101);
        }

        GoodEntity good = olGoodMapper.searchGoodsById(olTransEntity.getGoodId());

        if (ObjectUtils.isEmpty(good)) {
            throw new OlRuntimeException(Ol_USER_ERROR_0702);
        }

        //account ope 0 出金 1 入金 2 退款
        BigDecimal opeMoney = BigDecimal.valueOf(olTransEntity.getInCount() * olTransEntity.getInMoney());
        AccountOpeEntity accountOpeEntity
                = initAccountOpe(olTransEntity.getAccountId(), opeMoney.intValue());
        Integer count = accountOpeMapper.insertAccountOpe(accountOpeEntity);

        if (ObjectUtils.isEmpty(count) || count == 0) {
            throw new OlRuntimeException(Ol_USER_ERROR_1102);
        }

        Integer accountCont = accountMapper.updateAccountMoney(olTransEntity.getAccountId(), opeMoney.intValue()
                , "OlGoodServiceImpl.returnGood", LocalDateTime.now());

        if (ObjectUtils.isEmpty(accountCont) || accountCont == 0) {
            throw new OlRuntimeException(Ol_USER_ERROR_1102);
        }

        //用户退货开始  5是退货完成
        olTranMapper.updateOrderStatus(orderId,5,LocalDateTime.now(),"OlGoodServiceImpl.returnGood");

        return 1;
    }


    @Override
    public Integer AddComment(String content, Integer tranId, String commentRate) {

        if (ObjectUtils.isEmpty(content)) {
            content = COMMENT_DEFAULT_MESSAGE;
        }

        if (ObjectUtils.isEmpty(commentRate)) {
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

        OlComment comment = intiCommnet(content, tranId, commentRate);

        Integer result2 = olCommentMapper.addComment2(comment);

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

        return olComment;
    }


    private AccountOpeEntity initAccountOpe(Integer accountId, Integer opeMoney) {
        AccountOpeEntity result = new AccountOpeEntity();

        result.setAccountId(accountId);
        result.setOpeFlg("2");
        result.setOpeMoney(opeMoney);
        result.setOpeTime(LocalDateTime.now());
        result.setCreatedDate(LocalDateTime.now());
        result.setCreatedUser("OlGoodServiceImpl");
        result.setUpdateUser("OlGoodServiceImpl");
        result.setUpdateDate(LocalDateTime.now());
        return result;
    }
}
