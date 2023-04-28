package com.pcl.onlineshop.dao;

import com.pcl.onlineshop.dto.entity.UserEntity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface OlUserMapper {

    @Select("SELECT id FROM user WHERE mail = #{mail} AND password = #{password} AND is_delete != 1")
    Integer queryMailAndPassword(@Param("mail") String mail, @Param("password") String password);

    @Select("SELECT * FROM user where id = #{id}")
    UserEntity queryUserById(@Param("id")Integer id);
}
