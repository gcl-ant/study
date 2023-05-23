package com.pcl.onlineshop.dao;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(SpringExtension.class)
@SpringBootTest
class OlInfo2UserMapperTest {

    @Autowired
    private OlInfo2UserMapper olInfo2UserMapper;

    @Test
    void delInfoById001() {
        Integer count = olInfo2UserMapper.delInfoById(999);
        assert count == 0;
    }

    @Test
    void delInfoById002() {
        Integer count = olInfo2UserMapper.delInfoById(1);
        assert count == 1;
    }
}