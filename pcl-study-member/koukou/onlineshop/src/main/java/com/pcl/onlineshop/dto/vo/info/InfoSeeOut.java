package com.pcl.onlineshop.dto.vo.info;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pcl.onlineshop.dto.vo.ResponseBase;
import lombok.Data;

@Data
public class InfoSeeOut extends ResponseBase {

    @JsonProperty("info")
    private InfoVo infoVo;

}
