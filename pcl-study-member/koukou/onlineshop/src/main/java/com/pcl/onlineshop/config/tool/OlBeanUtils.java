package com.pcl.onlineshop.config.tool;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Log4j2
public class OlBeanUtils {
    private final static ObjectMapper objectMapper = new ObjectMapper();

    public static final <T, S> T createCopy(S oSrc, Class<T> type) {
        try {
            T copy = type.getDeclaredConstructor().newInstance();
            BeanUtils.copyProperties(oSrc, copy);
            return copy;
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
            log.catching(e);
        }
        return null;
    }

    public static final <T, S> List<T> createCopy(List<S> oSrc, Class<T> type) {
        return oSrc.stream().map(o -> createCopy(o, type)).collect(Collectors.toList());
    }


    public static final <T> T mapConvertToDto(Map<String, Object> map, Class<T> ouputClass) {
        T obj = objectMapper.convertValue(map, ouputClass);
        return obj;
    }

    public static final <T> T mapConvertToStreamDto(Map<Object, Object> map, Class<T> ouputClass) {
        T obj = objectMapper.convertValue(map, ouputClass);
        return obj;
    }


    @SuppressWarnings("unchecked")
    public static final <T, S> Map<String, Object> dtoConvertToMap(S oSrc) {
        Map<String, Object> mapResult = objectMapper.convertValue(oSrc, Map.class);
        return mapResult;
    }
}
