package com.pcl.onlineshop.config.olenum;


public enum ErrorEnum {
    Ol_USER_ERROR_001("001","ログイン失敗しました")
    ,Ol_USER_ERROR_1601("16001","request不正")
    ,Ol_USER_ERROR_1701("17001","infoIDが存在しない")
    ,Ol_USER_ERROR_1702("17002","おしらせが存在しない")
    ;


    ErrorEnum(String code, String content) {
        this.code = code;
        this.content = content;
    }

    private String code;
    private String content;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
