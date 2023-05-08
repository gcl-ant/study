package com.pcl.onlineshop.config.exception;

import com.pcl.onlineshop.config.olenum.ErrorEnum;

public class OlRuntimeException extends RuntimeException{

    private String code;
    private String content;

    public OlRuntimeException(ErrorEnum errorEnum) {
        super();
        this.code = errorEnum.getCode();
        this.content = errorEnum.getContent();
    }

    public String getCode() {
        return code;
    }
}
