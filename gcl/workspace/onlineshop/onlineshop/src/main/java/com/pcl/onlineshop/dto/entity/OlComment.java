package com.pcl.onlineshop.dto.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class OlComment {
    private int id;
    private String content;
    private int tranId;
    private String olCommnetDivision;
    private String isDelete;
    private LocalDateTime createdDate;
    private String createdUser;
    private LocalDateTime updateDate;
    private String updateUser;
}
