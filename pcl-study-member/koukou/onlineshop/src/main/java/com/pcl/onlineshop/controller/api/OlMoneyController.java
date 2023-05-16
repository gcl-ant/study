package com.pcl.onlineshop.controller.api;

import com.pcl.onlineshop.config.exception.OlRuntimeException;
import com.pcl.onlineshop.config.ol.annotion.UserIdCheckMethod;
import com.pcl.onlineshop.config.olenum.ErrorEnum;
import com.pcl.onlineshop.config.tool.OlBeanUtils;
import com.pcl.onlineshop.dto.MoneyDto;
import com.pcl.onlineshop.dto.vo.money.MoneyOut;
import com.pcl.onlineshop.dto.vo.money.MoneyVo;
import com.pcl.onlineshop.service.OlMoneyService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.pcl.onlineshop.controller.api.OlUserController.LOGIN_ACCOUNT_ID;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/money")
public class OlMoneyController {

    @Autowired
    OlMoneyService olMoneyService;

//    @RequestMapping(value = "/list", method = GET)
//    public MoneyOut getMoneyList(@RequestBody MoneyVo moneyVo) {
//
//        MoneyOut moneyOut = new MoneyOut();
//
//        List<MoneyDto> moneyDto = olMoneyService.queryMoneyListByAccountId(moneyVo.getAccountId());
//        moneyOut.setRequestResult("0");
//
//        if (!CollectionUtils.isEmpty(moneyDto)){
//            moneyOut.setMoneyVos(OlBeanUtils.createCopy(moneyDto, MoneyVo.class));
//            return moneyOut;
//        }
//        throw new OlRuntimeException(ErrorEnum.Ol_USER_ERROR_1602);
//    }

    @RequestMapping(value = "/list", method = POST)
    @UserIdCheckMethod
    public MoneyOut getMoneyList(HttpSession httpSession) {

        String accountId = httpSession.getAttribute(LOGIN_ACCOUNT_ID).toString();
        MoneyOut out = new MoneyOut();

        if (StringUtils.hasLength(accountId)) {
            List<MoneyDto> moneyDtos = olMoneyService.queryMoneyListByAccountId(Integer.valueOf(accountId));
            out.setRequestResult("0");
            if (!CollectionUtils.isEmpty(moneyDtos)) {
                out.setMoneyVos(OlBeanUtils.createCopy(moneyDtos, MoneyVo.class));
                return out;
            }
            return out;
        }
        throw new OlRuntimeException(ErrorEnum.Ol_USER_ERROR_1602);
    }
}
