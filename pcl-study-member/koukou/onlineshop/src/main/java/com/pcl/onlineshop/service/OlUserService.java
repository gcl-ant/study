package com.pcl.onlineshop.service;

import com.pcl.onlineshop.dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public interface OlUserService {

    UserDto login(String email,String password);
}
