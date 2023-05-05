package com.pcl.onlineshop.dto.vo.info;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class InfoVo {
    @JsonProperty("info_content")
    private String informationContent;

    @JsonProperty("send_flg")
    private String sendFlg;

    @JsonProperty("send_Time")
    private LocalDateTime sendSuccessTime;
}
