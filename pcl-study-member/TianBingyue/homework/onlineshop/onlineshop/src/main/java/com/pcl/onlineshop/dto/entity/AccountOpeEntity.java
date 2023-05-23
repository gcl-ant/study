package com.pcl.onlineshop.dto.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AccountOpeEntity {
    private Integer id;
    private Integer accountId;
    private String opeFlg;
    private Integer opeMoney;
    private LocalDateTime opeTime;
    private LocalDateTime createdDate;
    private String createdUser;
    private LocalDateTime updateDate;
    private String updateUser;
}
