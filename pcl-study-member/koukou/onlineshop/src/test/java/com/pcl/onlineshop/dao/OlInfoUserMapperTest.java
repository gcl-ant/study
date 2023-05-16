package com.pcl.onlineshop.dao;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
@ExtendWith(SpringExtension.class)
@SpringBootTest
class OlInfoUserMapperTest {

    @Autowired
    private OlInfoUserMapper olInfoUserMapper;

    @Test
    void delInfoById001() {
        Integer count = olInfoUserMapper.delInfoById(999);
        assert count == 0;
    }

//    @Test
//    void delInfoById002() {
//        Integer count = olInfoUserMapper.delInfoById(1);
//        assert count == 1;
//    }
}