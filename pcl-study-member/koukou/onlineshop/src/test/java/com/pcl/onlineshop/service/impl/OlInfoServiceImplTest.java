package com.pcl.onlineshop.service.impl;

import com.pcl.onlineshop.config.exception.OlRuntimeException;
import com.pcl.onlineshop.config.olenum.ErrorEnum;
import com.pcl.onlineshop.dao.OlInfoMapper;
import com.pcl.onlineshop.dao.OlInfoUserMapper;
import com.pcl.onlineshop.dto.InfoDto;
import com.pcl.onlineshop.dto.entity.InfoEntity;
import com.pcl.onlineshop.service.impl.OlInfoServiceImpl;
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

import static java.time.temporal.ChronoUnit.HOURS;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class OlInfoServiceImplTest {

    @InjectMocks
    OlInfoServiceImpl olInfoService;

    @Mock
    OlInfoMapper olInfoMapper;

    @Mock
    OlInfoUserMapper olInfoUserMapper;

    /**
     * 0件通知
     */
    @Test
    void queryInfoByUserID001() {
        List<InfoEntity> infoEntities = new ArrayList<>();
        Mockito.when(olInfoMapper.selectPrInfo(Mockito.anyInt())).thenReturn(infoEntities);
        try {
            olInfoService.queryInfoByUserID(1);
        } catch (OlRuntimeException ex) {
            assert ex.getCode().equals(ErrorEnum.Ol_USER_ERROR_001.getCode());
        }
    }

    /**
     * 1件通知
     */
    @Test
    void queryInfoByUserID002() {
        List<InfoEntity> infoEntities = new ArrayList<>();
        InfoEntity infoEntity = new InfoEntity();

        infoEntity.setId(1);
        infoEntity.setUserId(1);
        infoEntity.setSendFlg("1");
        infoEntity.setInformationContent("test");
        infoEntity.setSendSuccessTime(LocalDateTime.now());

        infoEntities.add(infoEntity);
        Mockito.when(olInfoMapper.selectPrInfo(Mockito.anyInt())).thenReturn(infoEntities);

        List<InfoDto> infoDtos = olInfoService.queryInfoByUserID(1);

        assert infoEntities.get(0).getId() == infoDtos.get(0).getId();
        assert infoEntities.get(0).getUserId() == infoDtos.get(0).getUserId();
        assert infoEntities.get(0).getSendFlg().equals(infoDtos.get(0).getSendFlg());
        assert infoEntities.get(0).getInformationContent().equals(infoDtos.get(0).getInformationContent());
        assert infoEntities.get(0).getSendSuccessTime().equals(infoDtos.get(0).getSendSuccessTime());
    }

    /**
     * n件通知
     */
    @Test
    void queryInfoByUserID003() {
        List<InfoEntity> infoEntities = new ArrayList<>();
        InfoEntity infoEntity = new InfoEntity();

        infoEntity.setId(1);
        infoEntity.setUserId(1);
        infoEntity.setSendFlg("1");
        infoEntity.setInformationContent("test");
        infoEntity.setSendSuccessTime(LocalDateTime.now());

        InfoEntity infoEntity2 = new InfoEntity();

        infoEntity2.setId(2);
        infoEntity2.setUserId(2);
        infoEntity2.setSendFlg("2");
        infoEntity2.setInformationContent("test2");
        infoEntity2.setSendSuccessTime(LocalDateTime.now().plus(2, HOURS));


        infoEntities.add(infoEntity);
        infoEntities.add(infoEntity2);
        Mockito.when(olInfoMapper.selectPrInfo(Mockito.anyInt())).thenReturn(infoEntities);

        List<InfoDto> infoDtos = olInfoService.queryInfoByUserID(1);

        assert infoEntities.get(0).getId() == infoDtos.get(0).getId();
        assert infoEntities.get(0).getUserId() == infoDtos.get(0).getUserId();
        assert infoEntities.get(0).getSendFlg().equals(infoDtos.get(0).getSendFlg());
        assert infoEntities.get(0).getInformationContent().equals(infoDtos.get(0).getInformationContent());
        assert infoEntities.get(0).getSendSuccessTime().equals(infoDtos.get(0).getSendSuccessTime());

        assert infoEntities.get(1).getId() == infoDtos.get(1).getId();
        assert infoEntities.get(1).getUserId() == infoDtos.get(1).getUserId();
        assert infoEntities.get(1).getSendFlg().equals(infoDtos.get(1).getSendFlg());
        assert infoEntities.get(1).getInformationContent().equals(infoDtos.get(1).getInformationContent());
        assert infoEntities.get(1).getSendSuccessTime().equals(infoDtos.get(1).getSendSuccessTime());
    }

    /**
     * paramater is null
     */
    @Test
    void delInfoById001() {
        Mockito.when(olInfoMapper.delInfoById(Mockito.anyInt())).thenReturn(1);
        try {
            olInfoService.delInfoById(null);
        } catch (OlRuntimeException ex) {
            assert ex.getCode().equals(ErrorEnum.Ol_USER_ERROR_1701.getCode());
        }
    }

    /**
     * paramater is  not null,  delInfoById returns is null
     */
    @Test
    void delInfoById002() {
        Mockito.when(olInfoMapper.delInfoById(Mockito.anyInt())).thenReturn(null);
        try {
            olInfoService.delInfoById(1);
        } catch (OlRuntimeException ex) {
            assert ex.getCode().equals(ErrorEnum.Ol_USER_ERROR_1702.getCode());
        }
    }

    /**
     * paramater is  not null , delInfoById returns is not  null but zero
     */
    @Test
    void delInfoById003() {
        Mockito.when(olInfoMapper.delInfoById(Mockito.anyInt())).thenReturn(0);
        try {
            olInfoService.delInfoById(1);
        } catch (OlRuntimeException ex) {
            assert ex.getCode().equals(ErrorEnum.Ol_USER_ERROR_1702.getCode());
        }
    }

    /**
     * paramater is  not null , delInfoById returns is not  null but 1
     */
    @Test
    void delInfoById004() {
        Mockito.when(olInfoMapper.delInfoById(Mockito.anyInt())).thenReturn(1);
        Mockito.when(olInfoUserMapper.delInfoById(Mockito.anyInt())).thenReturn(null);

        Integer count = olInfoService.delInfoById(1);

        assert count == 1;

    }

    /**
     * paramater is  not null , delInfoById returns is not  null but 1
     */
    @Test
    void delInfoById005() {
        Mockito.when(olInfoMapper.delInfoById(Mockito.anyInt())).thenReturn(1);
        Mockito.when(olInfoUserMapper.delInfoById(Mockito.anyInt())).thenReturn(0);

        Integer count = olInfoService.delInfoById(1);

        assert count == 1;
    }

    /**
     * paramater is  not null , delInfoById returns is not  null but 1
     */
    @Test
    void delInfoById006() {
        Mockito.when(olInfoMapper.delInfoById(Mockito.anyInt())).thenReturn(1);
        Mockito.when(olInfoUserMapper.delInfoById(Mockito.anyInt())).thenReturn(1);

        Integer count = olInfoService.delInfoById(1);

        assert count == 1;
    }



}