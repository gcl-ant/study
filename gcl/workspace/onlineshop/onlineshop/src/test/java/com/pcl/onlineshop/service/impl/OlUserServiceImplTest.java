package com.pcl.onlineshop.service.impl;

import com.pcl.onlineshop.dao.OlUserMapper;
import com.pcl.onlineshop.dto.entity.UserEntity;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.internal.matchers.Any;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.naming.ldap.PagedResultsControl;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class OlUserServiceImplTest {

    @InjectMocks
    OlUserServiceImpl userService;

    @Mock
    OlUserMapper olUserMapper;

    @Test
    void login() {

        UserEntity userEntity = new UserEntity();
        Mockito.when(olUserMapper.queryUserById(Mockito.any())).thenReturn(userEntity);

        Mockito.when(olUserMapper.queryMailAndPassword(Mockito.any(),Mockito.any())).thenReturn(1);
        userService.login("aaa","123");


    }
}