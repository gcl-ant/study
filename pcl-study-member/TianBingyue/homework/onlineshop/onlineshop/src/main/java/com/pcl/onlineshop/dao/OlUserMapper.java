package com.pcl.onlineshop.dao;

import com.pcl.onlineshop.dto.entity.UserEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface OlUserMapper {

    @Select(" SELECT " +
            "       id " +
            " FROM " +
            "       user " +
            " WHERE " +
            "     mail = #{mail} " +
            " AND " +
            "     password = #{password} " +
            " AND " +
            "     is_delete != 1")
    Integer queryMailAndPassword(@Param("mail") String mail, @Param("password") String password);

    @Select("SELECT * FROM user where id = #{id}")
    UserEntity queryUserById(@Param("id") Integer id);

    @Update("UPDATE user SET is_delete = 1 WHERE id = #{userId}")
    Integer withdrawalUser(@Param("userId") Integer userId);

    @Insert("INSERT  " +
            "INTO user (  " +
            "    sex " +
            "    , name " +
            "    , mail " +
            "    , password " +
            "    , user_role " +
            "    , send_mail_flg " +
            "    , is_delete " +
            "    , created_user " +
            "    , update_user " +
            ")  " +
            "VALUES (  " +
            "    #{sex} " +
            "    , #{name} " +
            "    , #{mail} " +
            "    , #{password} " +
            "    , #{user_role}" +
            "    , #{send_mail_flg} " +
            "    , \" 0 \" " +
            "    , \" SYS \" " +
            "    , \"SYS\"" +
            ")")
    Integer OlUserRegister(@Param("name") String name,
                           @Param("password") String password,
                           @Param("sex") String sex,
                           @Param("mail") String mail,
                           @Param("user_role") String userRole,
                           @Param("send_mail_flg") String sendMailFlg);

    @Select("SELECT id,is_delete FROM user WHERE mail = #{mail}")
    UserEntity queryUserIdAndIfDeletedByMail(@Param("mail") String mail);

    @Update("UPDATE user SET is_delete = 0 WHERE mail = #{mail}")
    Integer OlUserRegisterAgain(@Param("mail") String userMail);

    //用户更新
    //更新信息
    @Update(" <script> " +
            " UPDATE " +
            "     user " +
            " SET " +
            "     id = #{id}" +
            "     <if test=\"name != null \"> " +
            "     ,name = #{name} " +
            "    </if> " +
            "    <if test=\"sex != null \">" +
            "   , sex = #{sex} " +
            "    </if>" +
            " WHERE " +
            "   id = #{id} " +
            " </script> ")
    Integer updateUser(
            @Param("name") String name,
            @Param("sex") String sex,
            @Param("id") Integer id
    );

}



