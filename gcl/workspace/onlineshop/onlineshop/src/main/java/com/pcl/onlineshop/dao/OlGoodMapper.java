package com.pcl.onlineshop.dao;

import com.pcl.onlineshop.dto.entity.GoodEntity;
import com.pcl.onlineshop.dto.entity.GoodImageEntity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OlGoodMapper {

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
            "   goods" +
            " WHERE " +
            "   id = #{id}    "
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
