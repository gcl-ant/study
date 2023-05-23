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
        GoodEntity good = olGoodMapper.selectGoodsDetails(1);

        assert !ObjectUtils.isEmpty(good);

    }

    @Test
    void selectGoodsImages() {

        List<GoodImageEntity> imageEntities = olGoodMapper.selectGoodsImages(1);

        assert !ObjectUtils.isEmpty(imageEntities);
    }

    @Test
    void testGetAllGoods001() {

        List<GoodEntity> goodEntities = olGoodMapper.getAllGoods();

        assert !goodEntities.isEmpty();
    }


    @Test
    void testGetGoodById001() {

        GoodEntity good = olGoodMapper.searchGoodsById(1);

        assert good != null;
    }

    @Test
    void testGetGoodById002() {

        GoodEntity good = olGoodMapper.searchGoodsById(999);

        assert good == null;

    }


    @Test
    void changeGoodCondition001() {
        Integer count = olGoodMapper.changeGoodCondition(1,"賣家已出貨");
        assert count == 1;
    }

    //更新商品数量
    @Test
    void updateGoods001() {
        Integer count = olGoodMapper.updateGoods(1,109);
        assert count == 1;
    }

    //更新商品数量
    @Test
    void updateGoods002() {
        Integer count = olGoodMapper.updateGoods(0,109);
        assert count == 0;
    }
}