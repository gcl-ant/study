package com.pcl.onlineshop.service.impl;

import com.pcl.onlineshop.dao.OlGoodMapper;
import com.pcl.onlineshop.dao.OlUserMapper;
import com.pcl.onlineshop.service.OlGoodService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(SpringExtension.class)
@SpringBootTest
class OlGoodServiceImplTest {

    @InjectMocks
    OlGoodService olGoodService;

    @Mock
    OlGoodMapper olGoodMapper;

    @Test
    void queryGoodDetailById() {
    }
}