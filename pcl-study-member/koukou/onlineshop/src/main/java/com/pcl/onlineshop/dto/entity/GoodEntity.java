package com.pcl.onlineshop.dto.entity;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class GoodEntity {

    private Integer id;

    private String goodName;

    private Double inPrice;

    private Double outPrice;

    private String producer;

    private String desc;

    private Integer number;

    private Integer weight;

    private Integer netContent;

    private LocalDateTime validityTime;

    private String isDelete;

    private String discountFlg;

    private LocalDateTime createdDate;

    private LocalDateTime updateDate;

    private String updateUser;

    private String createdUser;
}
