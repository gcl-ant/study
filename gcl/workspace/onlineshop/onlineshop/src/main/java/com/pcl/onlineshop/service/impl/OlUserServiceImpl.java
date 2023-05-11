package com.pcl.onlineshop.service.impl;


import com.pcl.onlineshop.config.exception.OlRuntimeException;
import com.pcl.onlineshop.config.olenum.ErrorEnum;
import com.pcl.onlineshop.dao.OlUserMapper;
import com.pcl.onlineshop.dto.UserDto;
import com.pcl.onlineshop.dto.entity.UserEntity;
import com.pcl.onlineshop.service.OlUserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import static com.pcl.onlineshop.config.olenum.ErrorEnum.Ol_USER_ERROR_0501;
import static com.pcl.onlineshop.config.olenum.ErrorEnum.Ol_USER_ERROR_0502;

@Service
public class OlUserServiceImpl implements OlUserService {

    public static final String SUCCESS_STR = "0";

    public static final String FAIL_STR = "-1";

    @Autowired
    OlUserMapper userMapper;

    private static final Logger logger = LogManager.getLogger(OlUserServiceImpl.class);

    @Override
    public String updateUser(String name, String sex, Integer userId) {
        //判断用户ID是否存在，不存在则报错
        if (ObjectUtils.isEmpty(userId)) {
            logger.error(ErrorEnum.Ol_USER_ERROR_0401.getContent());
            throw new OlRuntimeException(ErrorEnum.Ol_USER_ERROR_0401);
        }

        Integer count = userMapper.updateUser(name, sex, userId);

        //判断用户更新是否成功，不成功则报错
        if (ObjectUtils.isEmpty(count) || count != 1) {
            logger.error(ErrorEnum.Ol_USER_ERROR_0402.getContent());
            throw new OlRuntimeException(ErrorEnum.Ol_USER_ERROR_0402);
        }
        return SUCCESS_STR;
    }

    @Override
    public String register(String name, String password, String sex, String mail,
                           String userRole, String sendMailFlg) {

        UserEntity userEntity = userMapper.queryUserIdAndIfDeletedByMail(mail);
        if (ObjectUtils.isEmpty(userEntity)) {
            userMapper.OlUserRegister(name, password, sex, mail, userRole, sendMailFlg);

            return SUCCESS_STR;
        } else if (userEntity.getIsDelete().equals("1")) {
            userMapper.OlUserRegisterAgain(mail);
            this.updateUser(name,sex,userEntity.getId());
            return SUCCESS_STR;
        } else {
            logger.error(ErrorEnum.Ol_USER_ERROR_0301.getContent());
            throw new OlRuntimeException(ErrorEnum.Ol_USER_ERROR_0301);
        }
    }

    @Override
    public UserDto login(String email, String password) {

        Integer userId = userMapper.queryMailAndPassword(email, password);

        if (ObjectUtils.isEmpty(userId) || userId == 0) {
            //ユーザが見つかれません
            logger.error(ErrorEnum.Ol_USER_ERROR_001.getContent());
            throw new OlRuntimeException(ErrorEnum.Ol_USER_ERROR_001);
        }
        UserDto userDto = new UserDto();

        BeanUtils.copyProperties(userMapper.queryUserById(userId), userDto);

        return userDto;
    }

    @Override
    public String withDrawUser(String email, String password) {

        if (StringUtils.hasLength(email) && StringUtils.hasLength(password)) {

            Integer userId = userMapper.queryMailAndPassword(email, password);

            if (ObjectUtils.isEmpty(userId)) {
                return FAIL_STR;
            }

            Integer count = userMapper.withdrawalUser(userId);

            if (ObjectUtils.isEmpty(count) || count == 0) {
                throw new OlRuntimeException(Ol_USER_ERROR_0502);
            }

            return SUCCESS_STR;
        }
        throw new OlRuntimeException(Ol_USER_ERROR_0501);
    }
}
