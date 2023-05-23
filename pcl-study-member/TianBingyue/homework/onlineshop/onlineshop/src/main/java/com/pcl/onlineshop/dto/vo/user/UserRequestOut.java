package com.pcl.onlineshop.dto.vo.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pcl.onlineshop.dto.vo.ResponseBase;
import lombok.Data;

@Data
public class UserRequestOut extends ResponseBase {

    @JsonProperty("user_name")
    private String userName;

}