package com.pcl.onlineshop.controller.api;

import com.pcl.onlineshop.config.ol.annotion.UserIdCheckMethod;
import com.pcl.onlineshop.dto.UserDto;
import com.pcl.onlineshop.dto.vo.ResponseBase;
import com.pcl.onlineshop.dto.vo.user.UserRequestIn;
import com.pcl.onlineshop.dto.vo.user.UserRequestOut;
import com.pcl.onlineshop.service.OlUserService;
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
        UserDto userDto = userService.login(userRequestIn.getUserName(), userRequestIn.getPassword());
        requestOut.setUserName(userDto.getName());
        requestOut.setRequestResult("0");

        //将用户的登录Id保存到session中
        httpSession.setAttribute(LOGIN_USER_ID, userDto.getId());
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







//    //用户信息修改
//
//    public String changeUser(HttpServletRequest request, HttpSession session) {
//
//
//        String name=request.getParameter("name");
//        String password=request.getParameter("password");
//
//
//        System.out.println("修改用户姓名"+name);
//        System.out.println("修改用户密码"+password);
//        OlUserService.updateUser(name,password);
//        //用户各个字段信息的更新  并返回该页面
//
//
//        return "/login/OlUserController";
//    }


//修改账户密码，不接项目原版
//public class userUpdate{
//private String user;
//private String password;
//public String getUser() {
//return user;
//}
//public String getPassword() {
//return password;
//}
//public void changeUser(String inputUser) {
//this.user=inputUser;
//}
//public void changePassword(String inputPassword) {
//this.password=inputPassword;
//}
//public TestUpdate(String user,String password) {
//this.user=user;
//this.psw=psw;
//}
//public String newInfo(){
//return"用户名:"+“user”+"\n密码："+password;
//}
//输入测试
//public static void main(String[] args) {
//Test t=new Test(“admin”,“123456” );
//Scanner input=new Scanner(System.in);
//System.out.println(“请输入原用户名：”);
//String inputuser=input.next();
//if(inputuser.equals(t.getUser())) {
//System.out.println(“用户名正确！”);
//System.out.println(“请输入新的用户名：”);
//String newuser=input.next();
//t.changeUser(newuser);
//}
//System.out.println(“请输入原密码：”);
//String inputpsw=input.next();
//if(inputpsw.equals(t.getPsw())) {
//System.out.println(“密码正确！”);
//System.out.println(“请输入新的密码：”);
//String newpsw=input.next();
//t.changePsw(newpsw);
//}
//else
//{
//System.out.println(“输入的信息错误，无法进行修改！”);
//}
//System.out.println(t.newInfo());
//}
