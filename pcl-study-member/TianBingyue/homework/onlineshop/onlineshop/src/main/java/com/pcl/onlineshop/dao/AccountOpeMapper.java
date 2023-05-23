package com.pcl.onlineshop.dao;

import com.pcl.onlineshop.dto.entity.AccountOpeEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountOpeMapper {

    @Insert(" INSERT  " +
            " INTO account_ope (  " +
            " account_id " +
            " ,ope_flg " +
            " ,ope_money " +
            " ,ope_time " +
            " ,created_date " +
            " ,created_user " +
            " ,update_date " +
            " ,update_user " +
            " )  " +
            " VALUES (  " +
            " #{ope.accountId} " +
            " ,#{ope.opeFlg} " +
            " ,#{ope.opeMoney} " +
            " ,#{ope.opeTime} " +
            " ,#{ope.createdDate} " +
            " ,#{ope.createdUser} " +
            " ,#{ope.updateDate} " +
            " ,#{ope.updateUser} " +
            ")")
    Integer insertAccountOpe(@Param("ope") AccountOpeEntity accountOpeEntity);
}