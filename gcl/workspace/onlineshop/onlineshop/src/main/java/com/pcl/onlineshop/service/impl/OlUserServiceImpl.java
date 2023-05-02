package com.pcl.onlineshop.service.impl;


import com.pcl.onlineshop.OnlineshopApplication;
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

@Service
public class OlUserServiceImpl implements OlUserService {

    @Autowired
    OlUserMapper userMapper;

    private static final Logger logger = LogManager.getLogger(OnlineshopApplication.class);

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
}
