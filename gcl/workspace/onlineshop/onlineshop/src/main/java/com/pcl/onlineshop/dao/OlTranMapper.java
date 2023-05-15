package com.pcl.onlineshop.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface OlTranMapper {

    @Select(" SELECT " +
            "   count(id) " +
            " FROM " +
            "   ol_tran " +
            " WHERE " +
            "   id=#{tran_id} ")
    Integer queryTranIdExist(@Param("tran_id") Integer tranId);
}
