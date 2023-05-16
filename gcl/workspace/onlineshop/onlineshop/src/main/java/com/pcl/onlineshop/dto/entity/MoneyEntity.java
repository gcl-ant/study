package com.pcl.onlineshop.dto.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MoneyEntity {
    private Integer id;

    private String accountName;

    private Integer accountMoney;

    private String isDelete;

    private Integer accountId;

    private String opeFlg;

    private Integer opeMoney;

    private LocalDateTime opeTime;

    private LocalDateTime createdDate;

    private String createdUser;

    private LocalDateTime updateDate;

    private String updateUser;
}
