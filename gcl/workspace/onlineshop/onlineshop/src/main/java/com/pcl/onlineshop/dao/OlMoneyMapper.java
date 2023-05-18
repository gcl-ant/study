package com.pcl.onlineshop.dao;

import com.pcl.onlineshop.dto.entity.MoneyEntity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface OlMoneyMapper {

    @Select(" SELECT " +
            "   ope.ope_flg " +
            "   ,ope.ope_money " +
            "   ,ope.ope_time " +
            " FROM " +
            "   account AS at" +
            " LEFT JOIN " +
            "   account_ope AS ope" +
            " ON " +
            "   at.id = ope.account_id " +
            " AND " +
            "   at.is_delete = 0 " +
            " LEFT JOIN " +
            "   user AS u " +
            " ON " +
            "   u.accout_id = ope.account_id " +
            " AND " +
            "   u.is_delete = 0 " +
            " WHERE " +
            "   u.id = #{userId} ")
    List<MoneyEntity> selectOpeMoneyHistory(@Param("userId") Integer userId);


    @Select(" SELECT " +
            "   at.id as account_id" +
            "   ,at.account_name " +
            "   ,at.account_money " +
            " FROM " +
            "   account AS at" +
            " LEFT JOIN " +
            "   user" +
            " ON " +
            "   at.id = user.accout_id " +
            " AND " +
            "   at.is_delete = 0 " +
            " AND " +
            "   user.is_delete = 0 " +
            " WHERE " +
            "   user.id = #{userId} ")
    MoneyEntity selectMoneyOut(@Param("userId") Integer userId);

    @Update(" UPDATE " +
            " account, ( select accout_id from user where id = #{userId}) as tu " +
            " SET " +
            " account_money =  #{amount} " +
            " WHERE " +
            " id= tu.accout_id "+
            " AND "+
            " is_delete = 0 ")
    Integer updateAccountMoney(@Param("userId") Integer userId,@Param("amount") BigDecimal amount);
}
