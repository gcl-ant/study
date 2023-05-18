package com.pcl.onlineshop.dao;

import com.pcl.onlineshop.dto.entity.OlTransEntity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface OlTranMapper {

    @Select(" SELECT " +
            "   count(id) " +
            " FROM " +
            "   ol_tran " +
            " WHERE " +
            "   id=#{tran_id} ")
    Integer queryTranIdExist(@Param("tran_id") Integer tranId);

    @Select(" SELECT " +
            "   good_id " +
            "   ,in_count " +
            "   ,in_money" +
            "   ,account_id  " +
            " FROM " +
            "   ol_tran " +
            " WHERE " +
            "   id=#{tran_id} ")
    OlTransEntity queryTranByEntityOrderId(@Param("tran_id") Integer tranId);

    @Update("UPDATE ol_tran " +
            "SET status = #{status}," +
            "update_date=#{nowTime}," +
            "update_user=#{serviceId} where  id=#{tran_id}")
    Integer updateOrderStatus(
            @Param("tran_id") Integer orderId
            , @Param("status") Integer status
            , @Param("nowTime") LocalDateTime nowTime
            , @Param("serviceId") String serviceId);
}
