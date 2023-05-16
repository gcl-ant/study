package com.pcl.onlineshop.config.intercepter;

import com.pcl.onlineshop.config.exception.OlRuntimeException;
import com.pcl.onlineshop.config.ol.annotion.UserIdCheckMethod;
import com.pcl.onlineshop.controller.api.OlUserController;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.util.ObjectUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import java.lang.reflect.Method;

import static com.pcl.onlineshop.config.olenum.ErrorEnum.Ol_USER_ERROR_002;

public class AuthInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request
            , HttpServletResponse response
            , Object handler) {

        //不是映射到方法就直接通过
        if (!(handler instanceof HandlerMethod)) {
            return true;
        }

        HandlerMethod handlerMethod = (HandlerMethod) handler;

        Method method = handlerMethod.getMethod();

        UserIdCheckMethod userIdCheckMethod = method.getAnnotation(UserIdCheckMethod.class);


        if (!ObjectUtils.isEmpty(userIdCheckMethod)) {

            Object userId = request.getSession().getAttribute(OlUserController.LOGIN_USER_ID);

            if (ObjectUtils.isEmpty(userId)) {
                throw new OlRuntimeException(Ol_USER_ERROR_002);
            }
            return true;
        }
        return true;
    }
}
