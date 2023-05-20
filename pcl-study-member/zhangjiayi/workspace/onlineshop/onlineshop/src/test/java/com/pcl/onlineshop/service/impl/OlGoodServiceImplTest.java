package com.pcl.onlineshop.service.impl;

import com.pcl.onlineshop.config.exception.OlRuntimeException;
import com.pcl.onlineshop.dao.OlGoodMapper;
import com.pcl.onlineshop.dto.GoodDto;
import com.pcl.onlineshop.dto.entity.GoodEntity;
import com.pcl.onlineshop.dto.entity.GoodImageEntity;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import com.pcl.onlineshop.config.olenum.ErrorEnum;
import java.util.ArrayList;
import java.util.List;


@ExtendWith(SpringExtension.class)
@SpringBootTest
class OlGoodServiceImplTest {

    @InjectMocks
    OlGoodServiceImpl olGoodService;


    @Mock
    OlGoodMapper olGoodMapper;

    /**
     * 模拟存在商品且存在图片
     */

    @Test
    void queryGoodDetailById001()  {
        GoodEntity goodEntity = new GoodEntity();
        goodEntity.setId(1);
        goodEntity.setGoodName("测试商品");

        GoodImageEntity goodImageEntity = new GoodImageEntity();
        goodImageEntity.setGoodId(1);
        goodImageEntity.setGoodSrc("https://example.com/1.jpg");

        Mockito.when(olGoodMapper.selectGoodsDetails(Mockito.anyInt())).thenReturn(goodEntity);

        List<GoodImageEntity> goodImageList = new ArrayList<>();
        goodImageList.add(goodImageEntity);
        Mockito.when(olGoodMapper.selectGoodsImages(Mockito.anyInt())).thenReturn(goodImageList);

        GoodDto goodDto = olGoodService.queryGoodDetailById(1);

        assert goodDto != null;
        assert goodDto.getId() == 1;
        assert goodDto.getGoodName().equals("测试商品");
        assert goodDto.getGoodImageList() != null && goodDto.getGoodImageList().size() == 1;
        assert goodDto.getGoodImageList().get(0).getGoodSrc().equals("https://example.com/1.jpg");
    }


    /**
        输入null
        */

    @Test
    void queryGoodDetailById002() {
        try {
            olGoodService.queryGoodDetailById(null);
            assert false;
        } catch (OlRuntimeException ex) {
            assert ex.getCode().equals(ErrorEnum.Ol_USER_ERROR_0701.getCode());
        }
    }

    /**
     * 商品情報が存在しない
     */

    @Test
    void queryGoodDetailById003() {
        Mockito.when(olGoodMapper.selectGoodsDetails(Mockito.eq(1))).thenReturn(null);
        try {
            olGoodService.queryGoodDetailById(1);
        } catch (OlRuntimeException ex) {
            assert ex.getCode().equals(ErrorEnum.Ol_USER_ERROR_0702.getCode());
        }
    }

    /**
     * 商品の写真情報が存在しない
     */

    @Test
    void queryGoodDetailById004() {
        Mockito.when(olGoodMapper.selectGoodsDetails(Mockito.eq(1))).thenReturn(new GoodDto());
        Mockito.when(olGoodMapper.selectGoodsImages(Mockito.eq(1))).thenReturn(null);
        try {
            olGoodService.queryGoodDetailById(1);
        } catch (OlRuntimeException ex) {
            assert ex.getCode().equals(ErrorEnum.Ol_USER_WARNING_0701.getCode());
        }
    }
}