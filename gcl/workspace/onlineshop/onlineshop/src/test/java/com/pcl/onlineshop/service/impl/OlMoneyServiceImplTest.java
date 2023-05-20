package com.pcl.onlineshop.service.impl;

import com.pcl.onlineshop.config.exception.OlRuntimeException;
import com.pcl.onlineshop.config.olenum.ErrorEnum;
import com.pcl.onlineshop.dao.AccountOpeMapper;
import com.pcl.onlineshop.dao.OlMoneyMapper;
import com.pcl.onlineshop.dto.MoneyDto;
import com.pcl.onlineshop.dto.entity.MoneyEntity;
import com.pcl.onlineshop.dto.entity.UserEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class OlMoneyServiceImplTest {
    @InjectMocks
    OlMoneyServiceImpl olMoneyService;

    @Mock
    OlMoneyMapper olMoneyMapper;

    @Mock
    AccountOpeMapper accountOpeMapper;
    @Test
    void queryMoneyListByAccountId001() {
        List<MoneyEntity> moneyEntities = new ArrayList<>();
        Mockito.when(olMoneyMapper.selectOpeMoneyHistory(Mockito.anyInt())).thenReturn(moneyEntities);
        try {
            olMoneyService.queryMoneyListByAccountId(20230001);
        } catch (OlRuntimeException ex) {
            assert ex.getCode().equals(ErrorEnum.Ol_USER_ERROR_1602.getCode());
        }
    }

    @Test
    //入金成功
    public void testDeposit1() {
        Integer userId = 1;
        Integer inMoney = 1000;
        MoneyEntity entity = new MoneyEntity();
        entity.setAccountId(1);
        entity.setAccountMoney(500);
        Mockito.when(olMoneyMapper.queryAccount(Mockito.any())).thenReturn(entity);
        Mockito.when(olMoneyMapper.updateAccountMoney(Mockito.any(), Mockito.any(),Mockito.any(),Mockito.any())).thenReturn(1);
        Mockito.when(accountOpeMapper.insertAccountOpe(Mockito.any())).thenReturn(1);

        String result = olMoneyService.deposit(userId, inMoney);

        Assertions.assertEquals("入金成功", result);
    }
}