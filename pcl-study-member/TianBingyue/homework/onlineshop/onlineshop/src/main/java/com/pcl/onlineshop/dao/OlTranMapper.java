package com.pcl.onlineshop.dao;

import com.pcl.onlineshop.dto.entity.OlTransEntity;
import org.apache.ibatis.annotations.Insert;
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

    @Insert(" INSERT INTO ol_tran (" +
            " good_id" +
            " ,tran_time " +
            " ,in_money " +
            " ,in_count " +
            " ,created_date " +
            " ,created_user " +
            " ,update_date " +
            " ,update_user " +
            " ,status " +
            " ,account_id " +
            " ) VALUES ( " +
            "  #{goodId} " +
            " ,#{nowTime} " +
            " ,#{money} " +
            " ,#{purchaseGoodCount} " +
            " ,#{nowTime} " +
            " ,#{upUser} " +
            " ,#{nowTime} " +
            " ,#{upUser} " +
            " ,#{status} " +
            " ,#{accountId} " +
            " ) ")
    Integer insetOlTran(@Param("goodId") Integer goodId
            , @Param("purchaseGoodCount") Integer purchaseGoodCount
            , @Param("money") Integer money
            , @Param("accountId") Integer accountId
            , @Param("nowTime") LocalDateTime now
            , @Param("upUser") String upUser
            , @Param("status") String status
    );
}