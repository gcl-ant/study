package com.pcl.onlineshop.service.impl;

import com.pcl.onlineshop.config.exception.OlRuntimeException;
import com.pcl.onlineshop.config.olenum.ErrorEnum;
import com.pcl.onlineshop.dao.OlMoneyMapper;
import com.pcl.onlineshop.dto.MoneyDto;
import com.pcl.onlineshop.dto.entity.MoneyEntity;
import com.pcl.onlineshop.dto.entity.UserEntity;
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

    @Test
    void queryMoneyListByAccountId002() {

    }
}