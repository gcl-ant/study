package com.pcl.onlineshop.dao;

import com.pcl.onlineshop.dto.entity.UserEntity;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class OlUserMapperTest {

    @Autowired
    private OlUserMapper userMapper;

    @Test
    public void testOlUserMapperQueryMailAndPassword001(){
        Integer count = userMapper.queryMailAndPassword("xiaoli@gmail.com","123456");
        assert count == 2;
    }

    @Test
    public void testOlUserMapperQueryMailAndPassword002(){
        int count = userMapper.queryMailAndPassword("xiaowang@gmail.com","123456");
        assert count == 1;
    }

    @Test
    public void testOlUserMapperQueryMailAndPassword003(){
        Integer count = userMapper.queryMailAndPassword("xiaohei@gmail.com","123456");
        assert count == 3;
    }

    @Test
    public void testOlUserMapperQueryUserById001(){
        UserEntity entity = userMapper.queryUserById(1);
        assert entity.getId() == 1;
    }

    @Test
    public void testOlUserMapperQueryUserById002(){
        UserEntity entity = userMapper.queryUserById(4);
        assert entity == null;
    }
}
