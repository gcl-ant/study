package com.pcl.onlineshop.dao;

import com.pcl.onlineshop.dto.entity.OlComment;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OlCommentMapper {
    //追加
    @Insert("INSERT  " +
            "INTO ol_comment (  " +
            "    content " +
            "    , tran_id " +
            "    , ol_commnet_division " +
            "    , is_delete " +
            "    , created_user " +
            "    , update_user " +
            ")  " +
            "VALUES (  " +
            "    #{commentEntity.content} " +
            "    , #{commentEntity.tranId} " +
            "    , #{commentEntity.olCommnetDivision} " +
            "    , '0' " +
            "    , 'SYS' " +
            "    , 'SYS' " +
            ")")
    Integer addComment(@Param("commentEntity") OlComment comment);

}
