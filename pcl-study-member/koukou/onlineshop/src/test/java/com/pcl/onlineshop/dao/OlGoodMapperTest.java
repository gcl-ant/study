package com.pcl.onlineshop.dao;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class OlGoodMapperTest {

//    @Autowired
//    OlGoodMapper olGoodMapper;
//
//    @Test
//    void selectGoodCondition001() {
//        String count = olGoodMapper.selectGoodCondition(1);
//        String test = "賣家已出貨";
//        assert count.equals(test) == true;
//    }
//
//    @Test
//    void selectGoodCondition002() {
//        String count = olGoodMapper.selectGoodCondition(3);
//        String test = "賣家已出貨";
//        assert count.equals(test) == false;
//    }
//
//    @Test
//    void selectGoodCondition003() {
//        String count = olGoodMapper.selectGoodCondition(5);
//        assert count == null;
//    }
//
//    @Test
//    void changeGoodCondition001() {
//        Integer count = olGoodMapper.changeGoodCondition(1,"賣家已出貨");
//        assert count == 1;
//    }

    @Autowired
    private OlGoodMapper olGoodMapper;


//    @Test
//    void selectGoodsDetails() {
//        GoodEntity good = olGoodMapper.selectGoodsDetails(1);
//
//        assert !ObjectUtils.isEmpty(good);
//
//    }
//
//    @Test
//    void selectGoodsImages() {
//
//        List<GoodImageEntity> imageEntities = olGoodMapper.selectGoodsImages(1);
//
//        assert !ObjectUtils.isEmpty(imageEntities);
//    }
//
//    @Test
//    void testGetAllGoods001() {
//
//        List<GoodEntity> goodEntities = olGoodMapper.getAllGoods();
//
//        assert !goodEntities.isEmpty();
//    }
//
//
//    @Test
//    void testGetGoodById001() {
//
//        GoodEntity good = olGoodMapper.searchGoodsById(1);
//
//        assert good != null;
//    }
//
//    @Test
//    void testGetGoodById002() {
//
//        GoodEntity good = olGoodMapper.searchGoodsById(999);
//
//        assert good == null;
//
//    }

    @Test
    void changeGoodCondition001() {
        Integer count = olGoodMapper.changeGoodCondition(1,"賣家已出貨");
        assert count == 1;
    }
}