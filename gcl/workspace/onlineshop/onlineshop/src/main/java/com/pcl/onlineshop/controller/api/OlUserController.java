package com.pcl.onlineshop.controller.api;

import com.pcl.onlineshop.config.exception.AuthException;
import com.pcl.onlineshop.config.ol.annotion.UserIdCheckMethod;
import com.pcl.onlineshop.dto.UserDto;
import com.pcl.onlineshop.dto.vo.ResponseBase;
import com.pcl.onlineshop.dto.vo.user.UserRequestIn;
import com.pcl.onlineshop.dto.vo.user.UserRequestOut;
import com.pcl.onlineshop.service.OlUserService;
import com.pcl.onlineshop.service.common.JwtService;
import com.sun.net.httpserver.Authenticator;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static com.pcl.onlineshop.config.consts.WebConst.LOGIN_URL;
import static com.pcl.onlineshop.config.consts.WebConst.SUCCESS;

@RestController
public class OlUserController {

    public static final String LOGIN_USER_ID = "userId";


    @Autowired
    OlUserService userService;

    @Autowired
    JwtService jwtService;

    @PostMapping(value = "/register/user")
    public ResponseBase register(@RequestBody UserRequestIn userRequestIn) {
        ResponseBase requestOut = new ResponseBase();
        String successFlag = userService.register(userRequestIn.getUserName(), userRequestIn.getPassword(),
                userRequestIn.getSex(), userRequestIn.getMail(), userRequestIn.getUserRole(),
                userRequestIn.getSendMailFlg());
        requestOut.setRequestResult(successFlag);
        return requestOut;
    }

    @PostMapping(value = LOGIN_URL)
    public ResponseBase doLogin(@RequestBody UserRequestIn userRequestIn, HttpSession httpSession) {
        UserRequestOut requestOut = new UserRequestOut();
        try {
            UserDto userDto = userService.login(userRequestIn.getUserName(), userRequestIn.getPassword());
//            requestOut.setUserName(userDto.getName());
            requestOut.setRequestResult("0");
            //将用户的登录Id保存到session中
            httpSession.setAttribute(LOGIN_USER_ID, userDto.getId());

            //调用JWTService生成JST TOKEN
            String jwtToken = jwtService.createToken(String.valueOf(userDto.getId()));


        } catch (Exception ex){
            throw new AuthException();
        }

        return requestOut;
    }

    @PostMapping(value = "/register/noUser")
    public ResponseBase withDrawUser(@RequestBody UserRequestIn userRequestIn) {
        ResponseBase requestOut = new ResponseBase();
        String successFlag = userService.withDrawUser(userRequestIn.getUserName(), userRequestIn.getPassword());
        requestOut.setRequestResult(successFlag);
        return requestOut;
    }

    @PostMapping(value = "/doLogOut")
    @UserIdCheckMethod
    public ResponseBase logOut(HttpSession httpSession) {
        ResponseBase requestOut = new ResponseBase();
        //将用户ID从session中去除
        httpSession.setAttribute(LOGIN_USER_ID, null);

        requestOut.setRequestResult(SUCCESS);
        return requestOut;
    }

    @PostMapping(value = "/updateUser")
    @UserIdCheckMethod
    public ResponseBase updateUser(@RequestBody UserRequestIn userRequestIn, HttpSession httpSession) {
        ResponseBase requestOut = new ResponseBase();

        Integer userId = (Integer) httpSession.getAttribute(LOGIN_USER_ID);

        String updateUser = userService.updateUser(
                userRequestIn.getUserName()
                , userRequestIn.getSex()
                , userId);
        requestOut.setRequestResult(updateUser);
        return requestOut;
    }
}
