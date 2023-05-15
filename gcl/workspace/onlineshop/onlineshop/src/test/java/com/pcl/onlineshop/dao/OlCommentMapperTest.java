package com.pcl.onlineshop.dao;

import com.pcl.onlineshop.dto.entity.OlComment;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class OlCommentMapperTest {


    @Autowired
    private OlCommentMapper olCommentMapper;

    @Test
    void addCommentTest001() {
        OlComment olComment = new OlComment();
        olComment.setContent("abcあいうえお中问");
        olComment.setTranId(1);
        olComment.setOlCommnetDivision("1");
        Integer count = olCommentMapper.addComment(olComment);
        assert count == 1;

    }



    @Test
    void addCommentTest002() {
        OlComment olComment = new OlComment();
        olComment.setContent("abcあいうえお中问");
        olComment.setTranId(1);
        olComment.setOlCommnetDivision("1");
        Integer count = olCommentMapper.addComment(olComment);
        assert count == 1;
    }
}