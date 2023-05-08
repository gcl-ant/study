package com.pcl.onlineshop.config.ol.deal;

import com.pcl.onlineshop.config.exception.OlRuntimeException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class OlExceptionHandler {

    @ExceptionHandler(value = OlRuntimeException.class)
    public void dealOlException(){

    }
}
