package com.pcl.onlineshop.dao;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class OlTranMapperTest {


    @Autowired
    OlTranMapper olTranMapper;

    @Test
    void updateOrderStatusTest001() {

        Integer updateCount =
                olTranMapper.updateOrderStatus(1, 0, LocalDateTime.now(), "OlTranMapperTest001");

        assert updateCount == 1;
    }


    @Test
    void updateOrderStatusTest002() {

        Integer updateCount =
                olTranMapper.updateOrderStatus(0, 2, LocalDateTime.now(), "OlTranMapperTest002");

        assert updateCount == 0;
    }
}