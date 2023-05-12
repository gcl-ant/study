package com.pcl.onlineshop.dao;

import com.pcl.onlineshop.dto.entity.GoodEntity;
import com.pcl.onlineshop.dto.entity.GoodImageEntity;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.util.ObjectUtils;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class OlGoodMapperTest {

    @Autowired
    private OlGoodMapper olGoodMapper;


    @Test
    void selectGoodsDetails() {
        GoodEntity good =  olGoodMapper.selectGoodsDetails(1);

        assert !ObjectUtils.isEmpty(good);

    }

    @Test
    void selectGoodsImages() {

        List<GoodImageEntity> imageEntities =  olGoodMapper.selectGoodsImages(1);

        assert !ObjectUtils.isEmpty(imageEntities);
    }
}