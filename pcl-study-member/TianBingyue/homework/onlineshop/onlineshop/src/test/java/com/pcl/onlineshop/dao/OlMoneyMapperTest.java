package com.pcl.onlineshop.dao;


import com.pcl.onlineshop.dto.entity.MoneyEntity;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class OlMoneyMapperTest {

    @Autowired
    private OlMoneyMapper olMoneyMapper;

    @Test
    void selectOlMoneyMapperTime001(){
        List<MoneyEntity> test = olMoneyMapper.selectOpeMoneyHistory(20230001);
        assert test.size() == 2;
    }

    @Test
    void selectOlMoneyMapperTime002(){
        List<MoneyEntity> test = olMoneyMapper.selectOpeMoneyHistory(20230000);
        assert test.size() == 0;
    }
}