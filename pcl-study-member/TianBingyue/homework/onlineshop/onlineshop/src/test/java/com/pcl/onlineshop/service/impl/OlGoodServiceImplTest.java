package com.pcl.onlineshop.service.impl;

import com.pcl.onlineshop.config.exception.OlRuntimeException;
import com.pcl.onlineshop.dao.*;
import com.pcl.onlineshop.dto.entity.GoodEntity;
import com.pcl.onlineshop.dto.entity.OlTransEntity;
import com.pcl.onlineshop.service.OlGoodService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static com.pcl.onlineshop.config.olenum.ErrorEnum.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class OlGoodServiceImplTest {

    @InjectMocks
    OlGoodServiceImpl olGoodService;

    @Mock
    OlGoodMapper olGoodMapper;

    @Mock
    OlTranMapper olTranMapper;

    @Mock
    AccountOpeMapper accountOpeMapper;

    @Mock
    AccountMapper accountMapper;


    @Test
    void changeGoodConditionTest001() {
        Mockito.when( olGoodMapper.changeGoodCondition(Mockito.any(),  Mockito.any())).thenReturn(null);
        try {
            olGoodService.changeGoodCondition(0,"1");
        } catch (OlRuntimeException oe) {
            assert oe.getCode().equals(Ol_USER_ERROR_0701.getCode());
        }
    }

    @Test
    void returnGoodTest001Error() {


        Mockito.when(olTranMapper.queryTranByEntityOrderId(Mockito.any())).thenReturn(null);

        try {
            olGoodService.returnGood(null);
        } catch (OlRuntimeException olRuntimeException) {
            assert olRuntimeException.getCode().equals(Ol_USER_ERROR_1001.getCode());
        }


    }

    @Test
    void returnGoodTest002Error() {
        Mockito.when(olTranMapper.queryTranByEntityOrderId(Mockito.any())).thenReturn(null);

        try {
            olGoodService.returnGood(1);
        } catch (OlRuntimeException olRuntimeException) {
            assert olRuntimeException.getCode().equals(Ol_USER_ERROR_1101.getCode());
        }
    }


    @Test
    void returnGoodTest003Error() {

        OlTransEntity entity = new OlTransEntity();
        Mockito.when(olTranMapper.queryTranByEntityOrderId(Mockito.any())).thenReturn(entity);
        Mockito.when(olTranMapper.updateOrderStatus(Mockito.any(), Mockito.any(), Mockito.any(), Mockito.any())).thenReturn(null);

        try {
            olGoodService.returnGood(1);
        } catch (OlRuntimeException olRuntimeException) {
            assert olRuntimeException.getCode().equals(Ol_USER_ERROR_1101.getCode());
        }
    }

    @Test
    void returnGoodTest004Error() {

        OlTransEntity entity = new OlTransEntity();
        Mockito.when(olTranMapper.queryTranByEntityOrderId(Mockito.any())).thenReturn(entity);
        Mockito.when(olTranMapper.updateOrderStatus(Mockito.any(), Mockito.any(), Mockito.any(), Mockito.any())).thenReturn(0);

        try {
            olGoodService.returnGood(1);
        } catch (OlRuntimeException olRuntimeException) {
            assert olRuntimeException.getCode().equals(Ol_USER_ERROR_1101.getCode());
        }
    }

    @Test
    void returnGoodTest005Error() {

        OlTransEntity entity = new OlTransEntity();
        entity.setGoodId(1);

        GoodEntity good = new GoodEntity();
        Mockito.when(olTranMapper.queryTranByEntityOrderId(Mockito.any())).thenReturn(entity);
        Mockito.when(olTranMapper.updateOrderStatus(Mockito.any(), Mockito.any(), Mockito.any(), Mockito.any())).thenReturn(1);
        Mockito.when(olGoodMapper.searchGoodsById(Mockito.any())).thenReturn(null);

        try {
            olGoodService.returnGood(1);
        } catch (OlRuntimeException olRuntimeException) {
            assert olRuntimeException.getCode().equals(Ol_USER_ERROR_0702.getCode());
        }
    }

    @Test
    void returnGoodTest006Error() {

        OlTransEntity entity = new OlTransEntity();
        entity.setGoodId(1);
        entity.setInCount(100);
        entity.setInMoney(9);

        GoodEntity good = new GoodEntity();
        Mockito.when(olTranMapper.queryTranByEntityOrderId(Mockito.any())).thenReturn(entity);
        Mockito.when(olTranMapper.updateOrderStatus(Mockito.any(), Mockito.any(), Mockito.any(), Mockito.any())).thenReturn(1);
        Mockito.when(olGoodMapper.searchGoodsById(Mockito.any())).thenReturn(good);
        Mockito.when(accountOpeMapper.insertAccountOpe(Mockito.any())).thenReturn(null);

        try {
            olGoodService.returnGood(1);
        } catch (OlRuntimeException olRuntimeException) {
            assert olRuntimeException.getCode().equals(Ol_USER_ERROR_1102.getCode());
        }
    }

    @Test
    void returnGoodTest007Error() {

        OlTransEntity entity = new OlTransEntity();
        entity.setGoodId(1);
        entity.setInCount(100);
        entity.setInMoney(9);

        GoodEntity good = new GoodEntity();
        Mockito.when(olTranMapper.queryTranByEntityOrderId(Mockito.any())).thenReturn(entity);
        Mockito.when(olTranMapper.updateOrderStatus(Mockito.any(), Mockito.any(), Mockito.any(), Mockito.any())).thenReturn(1);
        Mockito.when(olGoodMapper.searchGoodsById(Mockito.any())).thenReturn(good);
        Mockito.when(accountOpeMapper.insertAccountOpe(Mockito.any())).thenReturn(0);

        try {
            olGoodService.returnGood(1);
        } catch (OlRuntimeException olRuntimeException) {
            assert olRuntimeException.getCode().equals(Ol_USER_ERROR_1102.getCode());
        }
    }

    @Test
    void returnGoodTest008Error() {

        OlTransEntity entity = new OlTransEntity();
        entity.setGoodId(1);
        entity.setInCount(100);
        entity.setInMoney(9);

        GoodEntity good = new GoodEntity();
        Mockito.when(olTranMapper.queryTranByEntityOrderId(Mockito.any())).thenReturn(entity);
        Mockito.when(olTranMapper.updateOrderStatus(Mockito.any(), Mockito.any(), Mockito.any(), Mockito.any())).thenReturn(1);
        Mockito.when(olGoodMapper.searchGoodsById(Mockito.any())).thenReturn(good);
        Mockito.when(accountOpeMapper.insertAccountOpe(Mockito.any())).thenReturn(1);
        Mockito.when(accountMapper.updateAccountMoney(Mockito.any(), Mockito.any(), Mockito.any(), Mockito.any())).thenReturn(null);

        try {
            olGoodService.returnGood(1);
        } catch (OlRuntimeException olRuntimeException) {
            assert olRuntimeException.getCode().equals(Ol_USER_ERROR_1102.getCode());
        }
    }

    @Test
    void returnGoodTest009Error() {

        OlTransEntity entity = new OlTransEntity();
        entity.setGoodId(1);
        entity.setInCount(100);
        entity.setInMoney(9);

        GoodEntity good = new GoodEntity();
        Mockito.when(olTranMapper.queryTranByEntityOrderId(Mockito.any())).thenReturn(entity);
        Mockito.when(olTranMapper.updateOrderStatus(Mockito.any(), Mockito.any(), Mockito.any(), Mockito.any())).thenReturn(1);
        Mockito.when(olGoodMapper.searchGoodsById(Mockito.any())).thenReturn(good);
        Mockito.when(accountOpeMapper.insertAccountOpe(Mockito.any())).thenReturn(1);
        Mockito.when(accountMapper.updateAccountMoney(Mockito.any(), Mockito.any(), Mockito.any(), Mockito.any())).thenReturn(0);

        try {
            olGoodService.returnGood(1);
        } catch (OlRuntimeException olRuntimeException) {
            assert olRuntimeException.getCode().equals(Ol_USER_ERROR_1102.getCode());
        }
    }

    @Test
    void returnGoodTest010Error() {

        OlTransEntity entity = new OlTransEntity();
        entity.setGoodId(1);
        entity.setInCount(100);
        entity.setInMoney(9);

        GoodEntity good = new GoodEntity();
        Mockito.when(olTranMapper.queryTranByEntityOrderId(Mockito.any())).thenReturn(entity);
        Mockito.when(olTranMapper.updateOrderStatus(Mockito.any(), Mockito.eq(4), Mockito.any(), Mockito.any())).thenReturn(1);
        Mockito.when(olTranMapper.updateOrderStatus(Mockito.any(), Mockito.eq(5), Mockito.any(), Mockito.any())).thenReturn(null);
        Mockito.when(olGoodMapper.searchGoodsById(Mockito.any())).thenReturn(good);
        Mockito.when(accountOpeMapper.insertAccountOpe(Mockito.any())).thenReturn(1);
        Mockito.when(accountMapper.updateAccountMoney(Mockito.any(), Mockito.any(), Mockito.any(), Mockito.any())).thenReturn(1);

        try {
            olGoodService.returnGood(1);
        } catch (OlRuntimeException olRuntimeException) {
            assert olRuntimeException.getCode().equals(Ol_USER_ERROR_1102.getCode());
        }
    }

    @Test
    void returnGoodTest011Error() {

        OlTransEntity entity = new OlTransEntity();
        entity.setGoodId(1);
        entity.setInCount(100);
        entity.setInMoney(9);

        GoodEntity good = new GoodEntity();
        Mockito.when(olTranMapper.queryTranByEntityOrderId(Mockito.any())).thenReturn(entity);
        Mockito.when(olTranMapper.updateOrderStatus(Mockito.any(), Mockito.eq(4), Mockito.any(), Mockito.any())).thenReturn(1);
        Mockito.when(olTranMapper.updateOrderStatus(Mockito.any(), Mockito.eq(5), Mockito.any(), Mockito.any())).thenReturn(0);
        Mockito.when(olGoodMapper.searchGoodsById(Mockito.any())).thenReturn(good);
        Mockito.when(accountOpeMapper.insertAccountOpe(Mockito.any())).thenReturn(1);
        Mockito.when(accountMapper.updateAccountMoney(Mockito.any(), Mockito.any(), Mockito.any(), Mockito.any())).thenReturn(1);

        try {
            olGoodService.returnGood(1);
        } catch (OlRuntimeException olRuntimeException) {
            assert olRuntimeException.getCode().equals(Ol_USER_ERROR_1102.getCode());
        }
    }

    @Test
    void returnGoodTest012Normal() {

        OlTransEntity entity = new OlTransEntity();
        entity.setGoodId(1);
        entity.setInCount(100);
        entity.setInMoney(9);

        GoodEntity good = new GoodEntity();
        Mockito.when(olTranMapper.queryTranByEntityOrderId(Mockito.any())).thenReturn(entity);
        Mockito.when(olTranMapper.updateOrderStatus(Mockito.any(), Mockito.eq(4), Mockito.any(), Mockito.any())).thenReturn(1);
        Mockito.when(olTranMapper.updateOrderStatus(Mockito.any(), Mockito.eq(5), Mockito.any(), Mockito.any())).thenReturn(1);
        Mockito.when(olGoodMapper.searchGoodsById(Mockito.any())).thenReturn(good);
        Mockito.when(accountOpeMapper.insertAccountOpe(Mockito.any())).thenReturn(1);
        Mockito.when(accountMapper.updateAccountMoney(Mockito.any(), Mockito.any(), Mockito.any(), Mockito.any())).thenReturn(1);


        Integer count = olGoodService.returnGood(1);

        assert count == 1;
    }
}