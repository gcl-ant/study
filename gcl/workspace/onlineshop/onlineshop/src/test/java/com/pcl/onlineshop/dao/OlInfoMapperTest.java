package com.pcl.onlineshop.dao;

import com.pcl.onlineshop.dto.entity.InfoEntity;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class OlInfoMapperTest {

    @Autowired
    private OlInfoMapper olInfoMapper;

    /**
     * USERID 存在 INFO存在
     */
    @Test
    void selectPrInfoTestNormal001() {

        List<InfoEntity> infoEntities =  olInfoMapper.selectPrInfo(1);

        assert infoEntities.size() == 2;
    }

    /**
     * USERID 存在  INFO不存在
     */
    @Test
    void selectPrInfoTestNormal002() {

        List<InfoEntity> infoEntities =  olInfoMapper.selectPrInfo(3);

        assert infoEntities.size() == 1;
    }


    /**
     * USERID 不存在  INFO存在
     */
    @Test
    void selectPrInfoTestNormal003() {

        List<InfoEntity> infoEntities =  olInfoMapper.selectPrInfo(4);

        assert infoEntities.size() == 1;
    }

    /**
     * USERID 不存在  INFO不存在
     */
    @Test
    void selectPrInfoTestNormal004() {

        List<InfoEntity> infoEntities =  olInfoMapper.selectPrInfo(5);

        assert infoEntities.size() == 1;
    }

    /**
     * 删除InFo 不存在的ID
     */
    @Test
    void delInfoById001() {
       Integer count =  olInfoMapper.delInfoById(5);
        assert count == 0;
    }


    /**
     * 删除InFo 存在的ID
     */
    @Test
    void delInfoById002() {
        Integer count =  olInfoMapper.delInfoById(1);
        assert count == 1;
    }
}