package com.pcl.onlineshop.dto.vo.good;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GoodImages {

    @JsonProperty("good_url")
    private String goodSrc;
}
