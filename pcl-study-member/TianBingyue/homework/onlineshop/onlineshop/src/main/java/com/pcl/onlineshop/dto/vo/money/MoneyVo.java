package com.pcl.onlineshop.dto.vo.money;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MoneyVo {
    @JsonProperty("ope_flg")
    private String opeFlg;

    @JsonProperty("ope_money")
    private Integer opeMoney;

    @JsonProperty("ope_time")
    private LocalDateTime opeTime;


}