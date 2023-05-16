package com.pcl.onlineshop.config.ol.deal;

import com.pcl.onlineshop.config.exception.OlRuntimeException;
import com.pcl.onlineshop.dto.vo.ResponseBase;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class OlExceptionHandler {

    private static final String OL_ERROR_CODE = "99";

    private static final Logger logger = LogManager.getLogger(OlExceptionHandler.class);

    @ExceptionHandler(value = OlRuntimeException.class)
    public ResponseBase dealOlException(OlRuntimeException ex, HttpServletResponse httpServletResponse){
        return getResponseBase(ex);
    }

    @ExceptionHandler(value = Exception.class)
    public ResponseBase dealException(Exception ex, HttpServletResponse httpServletResponse){
        return getResponseBase(ex);
    }

    private static ResponseBase getResponseBase(Exception ex) {
        logger.error(ex.getMessage());
        ResponseBase responseBase = new ResponseBase();
        responseBase.setRequestResult(OL_ERROR_CODE);
        return responseBase;
    }

    private static ResponseBase getResponseBase(OlRuntimeException ex) {
        logger.error(ex.getMessage());
        ResponseBase responseBase = new ResponseBase();
        responseBase.setRequestResult(OL_ERROR_CODE);
        responseBase.setErrorCode(ex.getCode());
        return responseBase;
    }
}
