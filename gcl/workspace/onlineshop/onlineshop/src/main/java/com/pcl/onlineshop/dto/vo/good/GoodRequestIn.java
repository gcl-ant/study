package com.pcl.onlineshop.dto.vo.good;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GoodRequestIn {

    @JsonProperty("order_id")
    private Integer orderId;

    @JsonProperty("good_id")
    private Integer id;

    @JsonProperty("good_count")
    private Integer count;

    @JsonProperty("status")
    private String status;

}
