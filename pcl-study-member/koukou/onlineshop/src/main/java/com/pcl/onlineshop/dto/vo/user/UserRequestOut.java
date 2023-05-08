package com.pcl.onlineshop.dto.vo.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pcl.onlineshop.dto.vo.ResponseBase;

public class UserRequestOut extends ResponseBase {

    @JsonProperty("request_result")
    private String requestResult;

    @JsonProperty("user_name")
    private String userName;

    public void setRequestResult(String number) {
    }
}
