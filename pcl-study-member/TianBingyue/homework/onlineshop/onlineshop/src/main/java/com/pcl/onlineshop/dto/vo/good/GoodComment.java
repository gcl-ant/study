package com.pcl.onlineshop.dto.vo.good;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GoodComment {

    @JsonProperty("content")
    String content;

    @JsonProperty("tran_id")
    Integer tranId;

    @JsonProperty("comment_rate")
    String commentRate;

}


