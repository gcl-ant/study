package com.pcl.onlineshop.service;

import com.pcl.onlineshop.dto.UserDto;

public interface OlUserService {

    UserDto login(String email,String password);
}
