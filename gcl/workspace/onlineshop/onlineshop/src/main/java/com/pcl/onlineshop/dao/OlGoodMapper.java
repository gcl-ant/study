package com.pcl.onlineshop.dao;

import com.pcl.onlineshop.dto.entity.GoodEntity;
import com.pcl.onlineshop.dto.entity.GoodImageEntity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OlGoodMapper {


    @Select(" SELECT " +
            "   count(id) " +
            " FROM " +
            "   goods " +
            " WHERE " +
            "   id=#{good_id} ")
    Integer selectGoodCondition(@Param("good_id") Integer goodId);

    @Update(" UPDATE " +
            "   goods " +
            " SET" +
            "   goods.good_condition = #{good_condition} " +
            " WHERE " +
            "   goods.id = #{good_id} ")
    Integer changeGoodCondition(@Param("good_id") Integer goodId, @Param("good_condition") String goodCondition);

    @Select(" SELECT " +
            "  id " +
            "  ,good_name " +
            "  ,in_price " +
            "  ,out_price " +
            "  ,`desc` " +
            "  ,number " +
            "  ,validity_time " +
            "  ,discount_flg " +
            "  ,is_delete " +
            "  ,created_date" +
            "  ,created_user " +
            "  ,update_date " +
            "  ,update_user " +
            " FROM " +
            "     goods " +
            " ORDER BY update_date"
    )
    List<GoodEntity> getAllGoods();

    @Select("SELECT" +
            "  id " +
            "  ,good_name " +
            "  ,in_price " +
            "  ,out_price " +
            "  ,`desc` " +
            "  ,number " +
            "  ,validity_time " +
            "  ,discount_flg " +
            "  ,is_delete " +
            "  ,created_date" +
            "  ,created_user " +
            "  ,update_date " +
            "  ,update_user " +
            "FROM" +
            "  goods " +
            " WHERE" +
            "  id = #{goodId} ")
    GoodEntity searchGoodsById(@Param("goodId") Integer goodId);

    @Select(" SELECT " +
            "      id" +
            "    ,good_name" +
            "    ,in_price" +
            "    ,out_price" +
            "    ,`desc`" +
            "    ,number" +
            "    ,validity_time" +
            "    ,discount_flg" +
            "    ,is_delete" +
            " FROM " +
            "   goods " +
            " WHERE " +
            "   id = #{id} "
    )
    GoodEntity selectGoodsDetails(@Param("id") Integer id);

    @Select(" SELECT " +
            "     id" +
            "    ,good_id" +
            "    ,good_src" +
            " FROM " +
            "   good_images" +
            " WHERE " +
            "   good_id = #{goodId}    "
    )
    List<GoodImageEntity> selectGoodsImages(@Param("goodId") Integer goodId);

}
