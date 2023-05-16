package com.pcl.onlineshop.service.impl;

import com.pcl.onlineshop.dao.OlGoodMapper;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class OlGoodServiceImplTest {

    @InjectMocks
    OlGoodServiceImpl olGoodService;

    @Mock
    OlGoodMapper olGoodMapper;

//    @Test
//    void changeGoodCondition001() {
//        MoneyEntity moneyEntity = new MoneyEntity();
//        Mockito.when(olGoodMapper.selectGoodCondition(Mockito.any())).thenReturn(String.valueOf(moneyEntity));
//        try {
//            olGoodService.changeGoodCondition(1,true);
//        } catch (OlRuntimeException ex) {
//            assert ex.getCode().equals(ErrorEnum.Ol_USER_ERROR_1601.getCode());
//        }
//    }
//
//    @Test
//    void changeGoodCondition002() {
//        MoneyEntity moneyEntity = new MoneyEntity();
//        Mockito.when(olGoodMapper.selectGoodCondition(Mockito.any())).thenReturn(String.valueOf(0));
//        try {
//            olGoodService.changeGoodCondition(1,true);
//        } catch (OlRuntimeException ex) {
//            assert ex.getCode().equals(ErrorEnum.Ol_USER_ERROR_1601.getCode());
//        }
//    }
}