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

//    @Autowired
//    private OlUserMapper userMapper;
//
//    @Test
//    public void testOlUserMapperQueryMailAndPassword001(){
//        Integer count = userMapper.queryMailAndPassword("xiaoli@gmail.com","123456");
//        assert count == null;
//    }
//
//    @Test
//    public void testOlUserMapperQueryMailAndPassword002(){
//        int count = userMapper.queryMailAndPassword("xiaowang@gmail.com","123456");
//        assert count == 0;
//    }
//
//    @Test
//    public void testOlUserMapperQueryMailAndPassword003(){
//        Integer count = userMapper.queryMailAndPassword("xiaohei@gmail.com","123456");
//        assert count == null;
//    }
//
//    @Test
//    public void testOlUserMapperQueryUserById001(){
//        UserEntity entity = userMapper.queryUserById(1);
//        assert entity.getId() == 0;
//    }
//
//    @Test
//    public void testOlUserMapperQueryUserById002(){
//        UserEntity entity = userMapper.queryUserById(4);
//        assert entity == null;
//    }

    @Autowired
    private OlUserMapper userMapper;

    @Test
    public void testOlUserMapperQueryMailAndPassword001() {
        Integer count = userMapper.queryMailAndPassword("xiaoli@gmail.com", "123456");
        assert count == null;
    }

//    @Test
//    public void testOlUserMapperQueryMailAndPassword002() {
//        int count = userMapper.queryMailAndPassword("xiaowang@gmail.com", "123456");
//        assert count == 0;
//    }

    @Test
    public void testOlUserMapperQueryMailAndPassword003() {
        Integer count = userMapper.queryMailAndPassword("xiaohei@gmail.com", "123456");
        assert count == null;
    }

    @Test
    public void testOlUserMapperQueryUserById001() {
        UserEntity entity = userMapper.queryUserById(1);
        assert entity.getId() == 1;
    }

    @Test
    public void testOlUserMapperQueryUserById002() {
        UserEntity entity = userMapper.queryUserById(3);
        assert entity == null;
    }

    /**
     * not exsit user
     */
    @Test
    public void testWithDrawlUser001() {
        Integer count = userMapper.withdrawalUser(999);
        assert count == 0;
    }

    /**
     * exsit user
     */
    @Test
    public void testWithDrawlUser002() {
        Integer count = userMapper.withdrawalUser(1);
        assert count == 1;
    }

//    @Test
//    void testUserRegister001() {
//        Integer count = userMapper.OlUserRegister("Tian3", "tianjiyun", "1",
//                "tian3@gmail.com", "1", "1");
//        assert count == 1;
//    }
//
//
//    @Test
//    void testQueryUserIdByMail001() {
//        UserEntity entity = userMapper.queryUserIdAndIfDeletedByMail("xiaowang@gmail.com");
//        assert (entity.getId() == 1 && entity.getIsDelete().equals("0"));
//    }
//
//    @Test
//    void testQueryUserIdByMail002() {
//        UserEntity entity = userMapper.queryUserIdAndIfDeletedByMail("lisi@gmail.com");
//        assert (entity.getId() == 2 && entity.getIsDelete().equals("1"));
//    }

    @Test
    void testQueryUserIdByMail003() {
        UserEntity entity = userMapper.queryUserIdAndIfDeletedByMail("zhaoliu@gmail.com");
        assert entity == null;
    }

    @Test
    void olUserRegisterAgain() {
        Integer integer = userMapper.OlUserRegisterAgain("xiaowang@gmail.com");
        assert integer == 0;
    }

    @Test
    public void testOlUserMapperUpdateUser001() {
        Integer count = userMapper.updateUser(
                "小李1", "0" ,1
        );
        assert count == 1;
    }

    @Test
    public void testOlUserMapperUpdateUser002() {
        Integer count = userMapper.updateUser(
                "小周", "1",999
        );
        assert count == 0;
    }

    @Test
    public void testOlUserMapperUpdateUser003() {
        Integer count = userMapper.updateUser(
                null, "1",1
        );
        assert count == 1;
    }

    @Test
    public void testOlUserMapperUpdateUser004() {
        Integer count = userMapper.updateUser(
                "aaaa", null ,1
        );
        assert count == 1;
    }

    @Test
    public void testOlUserMapperUpdateUser005() {
        Integer count = userMapper.updateUser(
                null, null ,1
        );
        assert count == 1;
    }
//
//    @Test
//    public void testOlUserMapperUpdateUser006() {
//        Integer count = userMapper.updateUser(
//                "", "" ,1
//        );
//        assert count == 1;
//    }
//
//    @Test
//    public void testOlUserMapperUpdateUser007() {
//        Integer count = userMapper.updateUser(
//                "a", "" ,1
//        );
//        assert count == 1;
//    }
//
//    @Test
//    public void testOlUserMapperUpdateUser008() {
//        Integer count = userMapper.updateUser(
//                "", "0" ,1
//        );
//        assert count == 1;
//    }
}
