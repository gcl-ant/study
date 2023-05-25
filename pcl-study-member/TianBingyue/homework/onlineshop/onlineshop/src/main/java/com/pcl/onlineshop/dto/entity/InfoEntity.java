package com.pcl.onlineshop.dto.entity;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class InfoEntity {
    private int id;

    private int userId;

    private String informationContent;

    private String sendFlg;

    private LocalDateTime sendSuccessTime;

    private LocalDateTime createdDate;

    private String createdUser;

    private LocalDate updateDate;

    private LocalDateTime updateUser;
}