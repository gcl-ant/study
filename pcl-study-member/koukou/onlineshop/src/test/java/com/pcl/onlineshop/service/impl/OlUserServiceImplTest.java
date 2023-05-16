package com.pcl.onlineshop.service.impl;

import com.pcl.onlineshop.config.exception.OlRuntimeException;
import com.pcl.onlineshop.config.olenum.ErrorEnum;
import com.pcl.onlineshop.dao.OlUserMapper;
import com.pcl.onlineshop.dto.UserDto;
import com.pcl.onlineshop.dto.entity.UserEntity;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDateTime;

import static com.pcl.onlineshop.config.olenum.ErrorEnum.*;
import static com.pcl.onlineshop.service.impl.OlUserServiceImpl.SUCCESS_STR;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class OlUserServiceImplTest {

    @InjectMocks
    OlUserServiceImpl userService;

    @Mock
    OlUserMapper olUserMapper;

    @Test
    void loginTestError001() {
        UserEntity userEntity = new UserEntity();
        Mockito.when(olUserMapper.queryMailAndPassword(Mockito.any(), Mockito.any())).thenReturn(0);
        Mockito.when(olUserMapper.queryUserById(Mockito.any())).thenReturn(userEntity);
        try {
            userService.login("aaa", "123");
        } catch (OlRuntimeException ex) {
            assert ex.getCode().equals(ErrorEnum.Ol_USER_ERROR_001.getCode());
        }
    }


    @Test
    void loginTestError002() {
        UserEntity userEntity = new UserEntity();
        Mockito.when(olUserMapper.queryMailAndPassword(Mockito.any(), Mockito.any())).thenReturn(null);
        Mockito.when(olUserMapper.queryUserById(Mockito.any())).thenReturn(userEntity);
        try {
            userService.login("aaa", "123");
        } catch (OlRuntimeException ex) {
            assert ex.getCode().equals(ErrorEnum.Ol_USER_ERROR_001.getCode());
        }

    }


    @Test
    void loginTest001() {
        UserEntity userEntity = initUserEntity();

        Mockito.when(olUserMapper.queryMailAndPassword(Mockito.any(), Mockito.any())).thenReturn(1);
        Mockito.when(olUserMapper.queryUserById(Mockito.any())).thenReturn(userEntity);

        UserDto userDto = userService.login("aaa", "123");

        assert userDto.getId() == userEntity.getId();
        assert userDto.getName().equals(userEntity.getName());

    }

    @Test
    void withDrawUserTest001() {
        Mockito.when(olUserMapper.withdrawalUser(Mockito.any())).thenReturn(1);
        Mockito.when(olUserMapper.queryMailAndPassword(Mockito.any(), Mockito.any())).thenReturn(2);
        try {
            userService.withDrawUser(null, "vv");
        } catch (OlRuntimeException oe) {
            assert oe.getCode().equals(Ol_USER_ERROR_0501.getCode());
        }
    }

    @Test
    void withDrawUserTest002() {
        Mockito.when(olUserMapper.withdrawalUser(Mockito.any())).thenReturn(1);
        Mockito.when(olUserMapper.queryMailAndPassword(Mockito.any(), Mockito.any())).thenReturn(2);
        try {
            userService.withDrawUser("aa", null);
        } catch (OlRuntimeException oe) {
            assert oe.getCode().equals(Ol_USER_ERROR_0501.getCode());
        }
    }

    @Test
    void withDrawUserTest003() {
        Mockito.when(olUserMapper.withdrawalUser(Mockito.any())).thenReturn(1);
        Mockito.when(olUserMapper.queryMailAndPassword(Mockito.any(), Mockito.any())).thenReturn(2);
        try {
            userService.withDrawUser(null, null);
        } catch (OlRuntimeException oe) {
            assert oe.getCode().equals(Ol_USER_ERROR_0501.getCode());
        }
    }

    @Test
    void withDrawUserTest004() {
        Mockito.when(olUserMapper.withdrawalUser(Mockito.any())).thenReturn(1);
        Mockito.when(olUserMapper.queryMailAndPassword(Mockito.any(), Mockito.any())).thenReturn(2);
        try {
            userService.withDrawUser("", "");
        } catch (OlRuntimeException oe) {
            assert oe.getCode().equals(Ol_USER_ERROR_0501.getCode());
        }
    }

    @Test
    void withDrawUserTest005() {
        Mockito.when(olUserMapper.withdrawalUser(Mockito.any())).thenReturn(null);
        Mockito.when(olUserMapper.queryMailAndPassword(Mockito.any(), Mockito.any())).thenReturn(1);

        try {
            String result = userService.withDrawUser("a", "b");
        } catch (OlRuntimeException oe) {
            assert oe.getCode().equals(Ol_USER_ERROR_0502.getCode());
        }
    }

    @Test
    void withDrawUserTest006() {
        Mockito.when(olUserMapper.withdrawalUser(Mockito.any())).thenReturn(1);
        Mockito.when(olUserMapper.queryMailAndPassword(Mockito.any(), Mockito.any())).thenReturn(null);

        try {
            String result = userService.withDrawUser("a", "b");
        } catch (OlRuntimeException oe) {
            assert oe.getCode().equals(Ol_USER_ERROR_0502.getCode());
        }
    }

    @Test
    void withDrawUserTest007() {
        Mockito.when(olUserMapper.withdrawalUser(Mockito.any())).thenReturn(1);
        Mockito.when(olUserMapper.queryMailAndPassword(Mockito.any(), Mockito.any())).thenReturn(0);

        try {
            String result = userService.withDrawUser("a", "b");
        } catch (OlRuntimeException oe) {
            assert oe.getCode().equals(Ol_USER_ERROR_0502.getCode());
        }
    }

    @Test
    void withDrawUserTest008() {
        Mockito.when(olUserMapper.withdrawalUser(Mockito.any())).thenReturn(1);
        Mockito.when(olUserMapper.queryMailAndPassword(Mockito.any(), Mockito.any())).thenReturn(1);
        String result = userService.withDrawUser("aa", "vv");
        assert result.equals(SUCCESS_STR);
    }
//
//    @Test
//    void loginTest002() {
//
//        UserEntity userEntity = new UserEntity();
//        Mockito.when(olUserMapper.queryUserById(Mockito.any())).thenReturn(userEntity);
//        Mockito.when(olUserMapper.queryMailAndPassword(Mockito.any(), Mockito.any())).thenReturn(1);
//
//        userService.login("aaa", "123");
//    }


    private UserEntity initUserEntity() {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(1);
        userEntity.setCreatedUser("aaa");
        userEntity.setUpdateUser("bbb");
        userEntity.setUserRole("2");
        userEntity.setMail("test@test.com");
        userEntity.setCreatedDate(LocalDateTime.now());
        userEntity.setUpdateDate(LocalDateTime.now());
        userEntity.setIsDelete("0");
        userEntity.setName("xiaowangba");
        userEntity.setPassword("123456");
        userEntity.setSex("1");
        userEntity.setSendMailFlg("3");

        return userEntity;
    }

    @Test
    void registerTest001() {

        //email not exist,register success
        Mockito.when(olUserMapper.queryUserIdAndIfDeletedByMail(Mockito.any())).thenReturn(null);
        Mockito.when(olUserMapper.OlUserRegister(Mockito.any(), Mockito.any(), Mockito.any(), Mockito.any(), Mockito.any(),
                Mockito.any())).thenReturn(1);


        String result = userService.register("zhang", "zhang", "1", "zhang@mail.com", "1", "1");
        assert result == SUCCESS_STR;
    }

    @Test
    void registerTest002() {
        //email exist,is_delete is 1,register success
        Mockito.when(olUserMapper.queryUserIdAndIfDeletedByMail(Mockito.any())).thenReturn(initUserEntity2());
        Mockito.when(olUserMapper.updateUser(Mockito.any(), Mockito.any(), Mockito.any())).thenReturn(1);
//        Mockito.when(olUserMapper.这里添加田冰玥同学的userMapper.用户更新功能代码;
        String result = userService.register("zhang", "zhang", "1", "xiaoli@gmail.com", "1", "1");
        assert result.equals(SUCCESS_STR);
    }

    @Test
    void registerTest003() {
        //email existed,is_delete is 0,register failed,throw exception
        Mockito.when(olUserMapper.queryUserIdAndIfDeletedByMail(Mockito.any())).thenReturn(initUserEntity());
        try {
            userService.register("zhang", "zhang", "1", "test@test.com", "1", "1");
        } catch (OlRuntimeException oe) {
            assert oe.getCode().equals(Ol_USER_ERROR_0301.getCode());
        }
    }

    @Test
    void updateTest001() {
        //email existed,is_delete is 0,register failed,throw exception
        Mockito.when(olUserMapper.updateUser(Mockito.any(), Mockito.any(), Mockito.any())).thenReturn(null);
        try {
            userService.updateUser("zhang", "zhang", 1);
        } catch (OlRuntimeException oe) {
            assert oe.getCode().equals(Ol_USER_ERROR_0402.getCode());
        }
    }

    @Test
    void updateTest002() {
        //email existed,is_delete is 0,register failed,throw exception
        Mockito.when(olUserMapper.updateUser(Mockito.any(), Mockito.any(), Mockito.any())).thenReturn(1);

        String result = userService.updateUser("zhang", "zhang", 2);

        result.equals(SUCCESS_STR);
    }

    @Test
    void updateTest003() {
        //email existed,is_delete is 0,register failed,throw exception
        Mockito.when(olUserMapper.updateUser(Mockito.any(), Mockito.any(), Mockito.any())).thenReturn(1);
        try {
            userService.updateUser("zhang", "zhang", null);
        } catch (OlRuntimeException oe) {
            assert oe.getCode().equals(Ol_USER_ERROR_0401.getCode());
        }
    }

    @Test
    void updateTest004() {
        //email existed,is_delete is 0,register failed,throw exception
        Mockito.when(olUserMapper.updateUser(Mockito.any(), Mockito.any(), Mockito.any())).thenReturn(1);

        String result = userService.updateUser("zhang", "zhang", 2);

        result.equals(SUCCESS_STR);
    }

    private UserEntity initUserEntity2() {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(1);
        userEntity.setCreatedUser("aaa");
        userEntity.setUpdateUser("bbb");
        userEntity.setUserRole("2");
        userEntity.setMail("test@test.com");
        userEntity.setCreatedDate(LocalDateTime.now());
        userEntity.setUpdateDate(LocalDateTime.now());
        userEntity.setIsDelete("1");
        userEntity.setName("xiaowangba");
        userEntity.setPassword("123456");
        userEntity.setSex("1");
        userEntity.setSendMailFlg("3");

        return userEntity;
    }
}
