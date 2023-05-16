package com.pcl.onlineshop.service.impl;

import com.pcl.onlineshop.config.exception.OlRuntimeException;
import com.pcl.onlineshop.config.olenum.ErrorEnum;
import com.pcl.onlineshop.dao.OlMoneyMapper;
import com.pcl.onlineshop.dto.entity.MoneyEntity;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class OlMoneyServiceImplTest {
    @InjectMocks
    OlMoneyServiceImpl olMoneyService;

    @Mock
    OlMoneyMapper olMoneyMapper;
    @Test
    void queryMoneyListByAccountId001() {
        List<MoneyEntity> moneyEntities = new ArrayList<>();
        Mockito.when(olMoneyMapper.selectOpeMoneyTime(Mockito.anyInt())).thenReturn(moneyEntities);
        try {
            olMoneyService.queryMoneyListByAccountId(20230001);
        } catch (OlRuntimeException ex) {
            assert ex.getCode().equals(ErrorEnum.Ol_USER_ERROR_1602.getCode());
        }
    }

//    @Test
//    void queryMoneyListByAccountId002() {
//        List<MoneyEntity> moneyEntities = new ArrayList<>();
//        MoneyEntity moneyEntity = new MoneyEntity();
//        UserEntity userEntity = new UserEntity();
//
//        userEntity.setAccountId(20230000);
//        moneyEntity.setAccountId(20230000);
//        moneyEntity.setOpeFlg("1");
//        moneyEntity.setOpeMoney(1000);
//        moneyEntity.setOpeTime(LocalDateTime.now());
//
//        moneyEntities.add(moneyEntity);
//        Mockito.when(olMoneyMapper.selectOpeMoneyTime(Mockito.anyInt())).thenReturn(moneyEntities);
//        List<MoneyDto> moneyDtos = olMoneyService.queryMoneyListByAccountId(userEntity.getAccountId());
//
//        assert moneyEntities.get(0).getAccountId() == moneyDtos.get(0).getId();
//        assert moneyEntities.get(0).getOpeFlg().equals(moneyDtos.get(0).getOpeFlg());
//        assert moneyEntities.get(0).getOpeMoney() == moneyDtos.get(0).getOpeMoney();
//        assert moneyEntities.get(0).getOpeTime().equals(moneyDtos.get(0).getOpeTime());
//    }
}