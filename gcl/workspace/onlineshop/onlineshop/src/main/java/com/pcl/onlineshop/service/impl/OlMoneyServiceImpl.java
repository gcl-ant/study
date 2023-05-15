package com.pcl.onlineshop.service.impl;

import com.pcl.onlineshop.config.exception.OlRuntimeException;
import com.pcl.onlineshop.config.tool.OlBeanUtils;
import com.pcl.onlineshop.dao.OlMoneyMapper;
import com.pcl.onlineshop.dto.MoneyDto;
import com.pcl.onlineshop.dto.entity.MoneyEntity;
import com.pcl.onlineshop.service.OlMoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import java.util.List;

import static com.pcl.onlineshop.config.olenum.ErrorEnum.Ol_USER_ERROR_1602;
import static com.pcl.onlineshop.config.olenum.ErrorEnum.Ol_USER_ERROR_1703;

@Service
public class OlMoneyServiceImpl implements OlMoneyService {

    @Autowired
    OlMoneyMapper olMoneyMapper;

    @Override
    public List<MoneyDto> queryMoneyListByAccountId(Integer userId) {

        if (ObjectUtils.isEmpty(userId)){
            throw new OlRuntimeException(Ol_USER_ERROR_1703);
        }
        List<MoneyEntity> test = olMoneyMapper.selectOpeMoneyHistory(userId);
        if (CollectionUtils.isEmpty(test) || test.size() == 0){
            throw new OlRuntimeException(Ol_USER_ERROR_1602);
        }
        return OlBeanUtils.createCopy(test, MoneyDto.class);
    }
}
