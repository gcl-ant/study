package com.pcl.onlineshop.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class InfoDto {

    private int id;

    private int userId;

    private String informationContent;

    private String sendFlg;

    private LocalDateTime sendSuccessTime;

    private LocalDateTime createdDate;

    private String createdUser;

    private LocalDateTime updateDate;

    private String updateUser;
}
