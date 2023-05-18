package com.pcl.onlineshop.service.impl;

import com.pcl.onlineshop.config.exception.OlRuntimeException;
import com.pcl.onlineshop.config.tool.OlBeanUtils;
import com.pcl.onlineshop.dao.AccountOpeMapper;
import com.pcl.onlineshop.dao.OlMoneyMapper;
import com.pcl.onlineshop.dto.MoneyDto;
import com.pcl.onlineshop.dto.entity.AccountOpeEntity;
import com.pcl.onlineshop.dto.entity.MoneyEntity;
import com.pcl.onlineshop.service.OlMoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import static com.pcl.onlineshop.config.olenum.ErrorEnum.*;

@Service
public class OlMoneyServiceImpl implements OlMoneyService {

    private static final int MAX_WITHDRAW_AMOUNT = 10000;
    @Autowired
    OlMoneyMapper olMoneyMapper;

    @Autowired
    AccountOpeMapper accountOpeMapper;
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

    @Override
    @Transactional
    public String withdraw(Integer userId, Integer outMoney) {


        // 检查提现金额是否为负数
        if (outMoney < 0) {
            throw new OlRuntimeException(Ol_USER_ERROR_2001);
        }

        // 获取账户余额
        MoneyEntity moneyEntity = olMoneyMapper.selectMoneyOut(userId);

        Integer accountMoney =moneyEntity.getAccountMoney();
        if (accountMoney == null) {
            throw new OlRuntimeException(Ol_USER_ERROR_2003);
        }

        // 检查账户余额是否足够
        if (outMoney > accountMoney) {
            throw new OlRuntimeException(Ol_USER_ERROR_2002);
        }

        // 检查提现金额是否超出限制
        if (outMoney > MAX_WITHDRAW_AMOUNT) {
            throw new OlRuntimeException(Ol_USER_ERROR_2004);
        }

        // 执行提现操作，更新账户余额
        int updatedRows = olMoneyMapper.updateAccountMoney(userId,
                BigDecimal.valueOf(accountMoney - outMoney));

        if (updatedRows > 0) {
            // 提现成功,并更新履历
            AccountOpeEntity accountOpeEntity = outAccountOpe(moneyEntity.getAccountId(),  outMoney);

            accountOpeMapper.insertAccountOpe(accountOpeEntity);
            return "出金成功";
        }else{
            throw new OlRuntimeException(Ol_USER_ERROR_2003);
        }
    }

    private AccountOpeEntity outAccountOpe(Integer accountId, Integer opeMoney) {
        AccountOpeEntity result = new AccountOpeEntity();

        result.setAccountId(accountId);
        result.setOpeFlg("0");
        result.setOpeMoney(opeMoney);
        result.setOpeTime(LocalDateTime.now());
        result.setCreatedDate(LocalDateTime.now());
        result.setCreatedUser("OlMoneyServiceImpl");
        result.setUpdateDate(LocalDateTime.now());
        result.setUpdateUser("OlMoneyServiceImpl");

        return result;
    }

}
