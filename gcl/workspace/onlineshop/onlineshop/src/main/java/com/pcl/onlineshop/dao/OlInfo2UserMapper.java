package com.pcl.onlineshop.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OlInfo2UserMapper {


    @Delete(" DELETE FROM informations_to_user WHERE info_id = #{infoId}")
    Integer delInfoById(@Param("infoId")int infoId);
}
