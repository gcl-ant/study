package com.pcl.onlineshop.dto.vo.good;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GoodRequestIn {

    @JsonProperty("good_id")
    private Integer id;

    @JsonProperty("status")
    private String status;

}
