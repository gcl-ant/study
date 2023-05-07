package com.pcl.onlineshop.dao;

import com.pcl.onlineshop.dto.entity.InfoEntity;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OlInfoMapper {

    @Select(" SELECT " +
            "    info.id " +
            "    ,info.information_content " +
            "    ,info.send_flg " +
            "    ,info.send_success_time " +
            " FROM " +
            "    informations info " +
            "    LEFT JOIN informations_to_user info2User " +
            "        ON info2User.info_id = info.id " +
            " WHERE " +
            "    info2User.user_id = #{userId}    " +
            " OR " +
            "    info2User.user_id = 9999 ")
    List<InfoEntity> selectPrInfo(@Param("userId")int userId);


    @Delete(" DELETE FROM informations WHERE id = #{infoId}")
    Integer delInfoById(@Param("infoId")int infoId);
}
