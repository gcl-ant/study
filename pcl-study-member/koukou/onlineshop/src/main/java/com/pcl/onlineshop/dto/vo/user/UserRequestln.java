package com.pcl.onlineshop.dto.vo.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UserRequestln {

    @JsonProperty("user_name")
    private String userName;

    @JsonProperty("password")
    private String password;
}
