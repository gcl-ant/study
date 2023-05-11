package com.pcl.onlineshop.dto.vo.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NonNull;

@Data
public class UserRequestIn {

    @JsonProperty("user_name")
    private String userName;

    @JsonProperty("password")
    private String password;

    @JsonProperty("sex")
    private String sex;

    @JsonProperty("mail")
    private String mail;

    @JsonProperty("user_role")
    private String userRole;

    @JsonProperty("send_mail_flg")
    private String sendMailFlg;
}
