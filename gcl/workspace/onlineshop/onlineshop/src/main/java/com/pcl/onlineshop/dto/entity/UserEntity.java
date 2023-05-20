package com.pcl.onlineshop.dto.entity;


import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserEntity {

    private Integer id;

    private Integer accoutId;

    private String sex;

    private String name;

    private String mail;

    private String password;

    private String userRole;

    private String sendMailFlg;

    private String isDelete;

    private LocalDateTime createdDate;

    private String createdUser;

    private LocalDateTime updateDate;

    private String updateUser;



}
