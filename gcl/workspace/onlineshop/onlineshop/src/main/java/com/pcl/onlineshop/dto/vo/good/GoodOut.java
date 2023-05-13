package com.pcl.onlineshop.dto.vo.good;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pcl.onlineshop.dto.vo.ResponseBase;
import lombok.Data;

import java.util.List;

@Data
public class GoodOut  extends ResponseBase {

    @JsonProperty("goods")
    private List<GoodVo> goodVos;
}
