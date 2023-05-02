package com.pcl.onlineshop.dto.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UserRequestOut {

    @JsonProperty("request_result")
    private String requestResult;

    @JsonProperty("user_name")
    private String userName;

}
