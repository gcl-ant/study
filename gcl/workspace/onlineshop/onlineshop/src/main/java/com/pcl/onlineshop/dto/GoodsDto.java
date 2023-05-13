package com.pcl.onlineshop.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class GoodsDto {
    private Integer goodId;

    private String goodName;

    private Integer inPrice;

    private Integer outPrice;

    private Integer number;

    private LocalDateTime validityTime;

    private Character discountFlg;

    private String goodCondition;

    private Character isDelete;

    private LocalDateTime createdDate;

    private String createdUser;

    private LocalDateTime updateDate;

    private String updateUser;

    private Integer goodImageId;

    private String goodSrc;
}
