package com.pcl.onlineshop.dto.vo.good;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class GoodVo {

    @JsonProperty("good_id")
    private Integer id;

    @JsonProperty("good_name")
    String goodName;

    @JsonProperty("out_price")
    Double outPrice;

    @JsonProperty("amount")
    Integer amount;

    @JsonProperty("good_images")
    private List<GoodImages> goodImageList;

}
