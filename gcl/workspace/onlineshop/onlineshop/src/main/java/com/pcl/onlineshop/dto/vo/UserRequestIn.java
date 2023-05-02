package com.pcl.onlineshop.dto.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UserRequestIn {

    @JsonProperty("user_name")
    private String userName;

    private String password;
}
