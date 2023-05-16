package com.pcl.onlineshop.dao;

import com.pcl.onlineshop.dto.entity.MoneyEntity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OlMoneyMapper {
//ope_flg ope_money ope_time
    @Select(" SELECT " +
            "   account_ope.ope_flg " +
            "   ,account_ope.ope_money " +
            "   ,account_ope.ope_time " +
            " FROM " +
            "   account_ope " +
            "   LEFT JOIN user " +
            "       ON user.account_id = account_ope.account_id " +
            " WHERE " +
            "   user.account_id = #{account_id} ")
    List<MoneyEntity> selectOpeMoneyTime(@Param("account_id") Integer accountId);

}
