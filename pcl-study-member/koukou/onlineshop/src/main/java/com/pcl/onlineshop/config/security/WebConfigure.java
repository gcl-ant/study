package com.pcl.onlineshop.config.security;

import com.pcl.onlineshop.config.intercepter.AuthInterceptor;
import com.pcl.onlineshop.config.intercepter.LoginInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfigure implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(LoginInterceptor()).addPathPatterns("/**");
        registry.addInterceptor(AuthInterceptor()).addPathPatterns("/**");
    }

    @Bean
    public LoginInterceptor LoginInterceptor(){
        return new LoginInterceptor();
    }

    @Bean
    public AuthInterceptor AuthInterceptor(){
        return new AuthInterceptor();
    }
}
