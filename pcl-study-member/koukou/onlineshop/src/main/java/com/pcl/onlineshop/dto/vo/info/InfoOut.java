package com.pcl.onlineshop.dto.vo.info;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pcl.onlineshop.dto.vo.ResponseBase;
import lombok.Data;
import java.util.List;

@Data
public class InfoOut extends ResponseBase {

    @JsonProperty("infos")
    private List<InfoVo> infoVos;
}
