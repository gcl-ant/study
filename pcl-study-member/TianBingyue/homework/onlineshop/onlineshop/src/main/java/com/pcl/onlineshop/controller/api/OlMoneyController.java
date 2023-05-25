package com.pcl.onlineshop.controller.api;

import com.pcl.onlineshop.config.ol.annotion.UserIdCheckMethod;
import com.pcl.onlineshop.config.tool.OlBeanUtils;
import com.pcl.onlineshop.dto.MoneyDto;
import com.pcl.onlineshop.dto.vo.ResponseBase;
import com.pcl.onlineshop.dto.vo.money.MoneyOut;
import com.pcl.onlineshop.dto.vo.money.MoneyRequestIn;
import com.pcl.onlineshop.dto.vo.money.MoneyVo;
import com.pcl.onlineshop.service.OlMoneyService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.pcl.onlineshop.controller.api.OlUserController.LOGIN_USER_ID;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/money")
public class OlMoneyController {

    @Autowired
    OlMoneyService olMoneyService;

    @RequestMapping(value = "/list", method = GET)
    @UserIdCheckMethod
    public MoneyOut getMoneyList(HttpSession httpSession) {

        String userId = httpSession.getAttribute(LOGIN_USER_ID).toString();
        MoneyOut out = new MoneyOut();

        List<MoneyDto> moneyDtos = olMoneyService.queryMoneyListByAccountId(Integer.valueOf(userId));
        out.setRequestResult("0");
        if (!CollectionUtils.isEmpty(moneyDtos)) {
            out.setMoneyVos(OlBeanUtils.createCopy(moneyDtos, MoneyVo.class));
            return out;
        }
        return out;
    }


    @PostMapping("/cashOut")
    @UserIdCheckMethod
    public ResponseBase cashOut(HttpSession httpSession, @RequestBody MoneyRequestIn moneyRequestIn) {

        Integer userId = (Integer) httpSession.getAttribute(LOGIN_USER_ID);

        Integer outMoney = moneyRequestIn.getOutMoney();

        String result = olMoneyService.withdraw(userId, outMoney);

        MoneyOut out = new MoneyOut();
        if (result.isEmpty()) {
            out.setRequestResult("0");
        } else {
            out.setRequestResult(result);
        }

        return out;

    }

    @PostMapping("/cashIn")
    @UserIdCheckMethod
    public ResponseBase cashIn(HttpSession httpSession, @RequestBody MoneyRequestIn moneyRequestIn) {

        Integer userId = (Integer) httpSession.getAttribute(LOGIN_USER_ID);

        Integer inMoney = moneyRequestIn.getInMoney();

        String result = olMoneyService.deposit(userId, inMoney);

        ResponseBase out = new ResponseBase();
        if (result.isEmpty()) {
            out.setRequestResult("0");
        } else {
            out.setRequestResult(result);
        }

        return out;

    }

}