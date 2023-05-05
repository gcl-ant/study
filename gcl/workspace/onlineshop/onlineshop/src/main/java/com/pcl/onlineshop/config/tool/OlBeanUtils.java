/*
 * (c) 2021 Hash DasH Holdings Co., Ltd. ALL Rights Reserved.
 *
 * システム名：スマホ専業証券システム
 */
package com.pcl.onlineshop.config.tool;

import java.lang.reflect.InvocationTargetException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalTimeSerializer;

import lombok.extern.log4j.Log4j2;

/**
 * オブジェクトの共通ユーティリティ
 *
 * @author Hash DasH Holdings
 */
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

    /**
     * MapをEntityに変える
     *
     * @param <T>
     * @param map 転換元Map
     * @param ouputClass 転換先Class
     * @return T
     */
    public static final <T> T mapConvertToDto(Map<String, Object> map, Class<T> ouputClass) {
        T obj = objectMapper.convertValue(map, ouputClass);
        return obj;
    }
    /**
     * MapをEntityに変える
     *
     * @param <T>
     * @param map 転換元Map
     * @param ouputClass 転換先Class
     * @return T
     */
    public static final <T> T mapConvertToStreamDto(Map<Object, Object> map, Class<T> ouputClass) {
        T obj = objectMapper.convertValue(map, ouputClass);
        return obj;
    }

    /**
     * EntityをMapに変える
     *
     * @param oSrc
     * @return T
     */
    @SuppressWarnings("unchecked")
    public static final <T, S> Map<String, Object> dtoConvertToMap(S oSrc) {
        Map<String, Object> mapResult = objectMapper.convertValue(oSrc, Map.class);
        return mapResult;
    }
}
