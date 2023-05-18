package com.pcl.onlineshop.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;


@Repository
public interface AccountMapper {

    //更新商品数量
    @Update(" UPDATE " +
            "   account,( SELECT (account_money + #{money}) as up_money FROM  account WHERE id = #{id} ) as t2" +
            " SET" +
            "   account_money = t2.up_money" +
            "   ,update_user = #{upUser} " +
            "   ,update_date = #{nowTime} " +
            " WHERE " +
            "   id = #{id} " +
            " AND " +
            "   is_delete = 0  ")
    Integer updateAccountMoney(@Param("id") Integer accountId
                                , @Param("money") Integer number
                                ,@Param("upUser") String upUser
                                ,@Param("nowTime") LocalDateTime nowTime);

}
