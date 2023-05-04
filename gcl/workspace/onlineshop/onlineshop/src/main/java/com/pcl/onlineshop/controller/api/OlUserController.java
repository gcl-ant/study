package com.pcl.onlineshop.controller.api;

import com.pcl.onlineshop.dto.UserDto;
import com.pcl.onlineshop.dto.vo.ResponseBase;
import com.pcl.onlineshop.dto.vo.user.UserRequestIn;
import com.pcl.onlineshop.dto.vo.user.UserRequestOut;
import com.pcl.onlineshop.service.OlUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OlUserController {

    @Autowired
    OlUserService userService;

    @PostMapping(value = "/doLogin")
    public ResponseBase doLogin(@RequestBody UserRequestIn userRequestIn) {
        UserRequestOut requestOut = new UserRequestOut();
        UserDto userDto = userService.login(userRequestIn.getUserName(), userRequestIn.getPassword());
        requestOut.setUserName(userDto.getName());
        requestOut.setRequestResult("0");
        return requestOut;
    }
}
