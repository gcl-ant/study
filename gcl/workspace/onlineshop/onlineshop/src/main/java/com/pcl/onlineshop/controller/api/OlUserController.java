package com.pcl.onlineshop.controller.api;

import com.pcl.onlineshop.dto.UserDto;
import com.pcl.onlineshop.dto.vo.UserRequestIn;
import com.pcl.onlineshop.dto.vo.UserRequestOut;
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
    public UserRequestOut doLogin(@RequestBody UserRequestIn userRequestIn) {

        UserRequestOut requestOut = new UserRequestOut();

        try {
            UserDto userDto = userService.login(userRequestIn.getUserName(), userRequestIn.getPassword());
            requestOut.setUserName(userDto.getName());
            requestOut.setRequestResult("0");
        }catch (Exception ex){
            ex.printStackTrace();
            requestOut.setRequestResult("-99");
        }

        return requestOut;
    }
}
