package com.pcl.onlineshop.controller.api;

import com.pcl.onlineshop.config.ol.annotion.UserIdCheckMethod;
import com.pcl.onlineshop.dto.vo.money.MoneyOut;
import com.pcl.onlineshop.dto.vo.money.MoneyRequestIn;
import com.pcl.onlineshop.service.OlGoodService;
import com.pcl.onlineshop.service.OlMoneyService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.pcl.onlineshop.controller.api.OlUserController.LOGIN_USER_ID;

@RestController
@RequestMapping(value = "/money")
public class MoneyController {


    @Autowired
    OlMoneyService olMoneyService;

    @PostMapping("/cashOut")
    @UserIdCheckMethod
    public MoneyOut cashOut(HttpSession httpSession, @RequestBody MoneyRequestIn moneyRequestIn) {

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
}
