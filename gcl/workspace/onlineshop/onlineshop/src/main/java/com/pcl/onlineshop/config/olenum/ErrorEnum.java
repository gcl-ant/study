package com.pcl.onlineshop.config.olenum;


public enum ErrorEnum {
    Ol_USER_ERROR_001("001","ログイン失敗しました")
    ,Ol_USER_ERROR_002("002","ユーザがログインしない")
    ,Ol_USER_ERROR_0301("0301","ユーザーが既に存在している")
    ,Ol_USER_ERROR_0401("0401","ユーザーがまだログインされません" )
    ,Ol_USER_ERROR_0402("0402","ユーザーがデータ更新が異常になる" )
    ,Ol_USER_ERROR_0501("05001","入力パラメータ不正")
    ,Ol_USER_ERROR_0502("05002","ユーザーが退会でした")
    ,Ol_USER_ERROR_0701("07001","入力パラメータ不正")
    ,Ol_USER_ERROR_0702("07002","商品情報が存在しない")
    ,Ol_USER_WARNING_0701("W07001","商品の写真情報が存在しない")
    ,Ol_USER_ERROR_1601("16001","request不正")
    ,Ol_USER_ERROR_1701("17001","infoIDが存在しない")
    ,Ol_USER_ERROR_1702("17002","おしらせが存在しない");



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
