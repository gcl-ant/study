package com.pcl.onlineshop.dto.vo.money;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pcl.onlineshop.dto.vo.ResponseBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class MoneyOut extends ResponseBase {
    @JsonProperty("moneys")
    private List<MoneyVo> moneyVos;
}
