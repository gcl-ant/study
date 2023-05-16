package com.pcl.onlineshop.service;

import com.pcl.onlineshop.dto.MoneyDto;
import java.util.List;

public interface OlMoneyService {

    List<MoneyDto> queryMoneyListByAccountId(Integer accountId);

}
