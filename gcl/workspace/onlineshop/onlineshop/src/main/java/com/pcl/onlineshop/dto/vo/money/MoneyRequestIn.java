package com.pcl.onlineshop.dto.vo.money;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MoneyRequestIn {

    @JsonProperty("out_money")
    private Integer outMoney;

    @JsonProperty("in_money")
    private Integer inMoney;

    //1 全部出，  0 部分出
    @JsonProperty("all_out_flag")
    private String all_out_flag;
}
