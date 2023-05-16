package com.pcl.onlineshop.dto.vo.good;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pcl.onlineshop.dto.vo.ResponseBase;
import lombok.Data;

import java.util.List;

@Data
public class GoodDetail extends ResponseBase {

    @JsonProperty("good_id")
    private Integer id;

    @JsonProperty("good_name")
    private String goodName;

    @JsonProperty("good_desc")
    private String desc;

    @JsonProperty("good_images")
    private List<GoodImages> goodImages;
}
