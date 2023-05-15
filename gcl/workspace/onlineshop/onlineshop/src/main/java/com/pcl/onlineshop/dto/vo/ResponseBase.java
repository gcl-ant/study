package com.pcl.onlineshop.dto.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ResponseBase {
    @JsonProperty("request_result")
    private String requestResult;

    @JsonProperty("error_code")
    private String errorCode;

}
