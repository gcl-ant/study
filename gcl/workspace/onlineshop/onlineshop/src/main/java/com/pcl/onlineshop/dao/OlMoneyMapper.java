package com.pcl.onlineshop.dao;

import com.pcl.onlineshop.dto.entity.MoneyEntity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

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
}
