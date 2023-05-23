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


    //package com.soft.entity;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class AfterSale {
//    private int id;//售后id
//    private int userId;//用户id
//    private int orderId;//订单id
//    private double money;//退款金额
//    private String remarks;//备注信息
//    private int type;//类型 1：退货 2：退款 3：关闭
//}

