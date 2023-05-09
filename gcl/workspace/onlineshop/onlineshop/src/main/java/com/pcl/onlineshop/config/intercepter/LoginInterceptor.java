package com.pcl.onlineshop.config.intercepter;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;

import static com.pcl.onlineshop.config.consts.WebConst.LOGIN_URL;
import static com.pcl.onlineshop.config.consts.WebConst.NO_CHECK_URL;

;

public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request
            , HttpServletResponse response
            , Object handler) {
        String path = request.getServletPath();

        if (path.matches(NO_CHECK_URL)) {
            return true;
        } else if (path.matches(LOGIN_URL)){
            return true;
        }
        return true;
    }
}
