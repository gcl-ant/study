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
    ,Ol_USER_ERROR_0703("07003","商品が不在庫になります")
    ,Ol_USER_ERROR_0901("09001","商品状態更新失敗しました")
    ,Ol_USER_WARNING_0701("W07001","商品の写真情報が存在しない")
    ,Ol_USER_ERROR_1001("10001","入力パラメータ不正")
    ,Ol_USER_ERROR_1002("10002","2文字以上の入力をしてください")
    ,Ol_USER_ERROR_1003("10003","入力内容は”1”か、”2”をしてください")
    ,Ol_USER_ERROR_1004("10004","取引実績が存在しない")
    ,Ol_USER_ERROR_1101("11001","注文履歴が存在しない")
    ,Ol_USER_ERROR_1102("11002","用户退款失败")
    ,Ol_USER_ERROR_1103("11003","注文失敗しました")
    ,Ol_USER_ERROR_1104("11004","預り金が不足になります")
    ,Ol_USER_ERROR_1601("16001","request不正")
    ,Ol_USER_ERROR_1602("16002","入出金したことがない")
    ,Ol_USER_ERROR_1701("17001","infoIDが存在しない")
    ,Ol_USER_ERROR_1702("17002","おしらせが存在しない")
    ,Ol_USER_ERROR_1703("17003","accountIDが存在しない")
    ,Ol_USER_ERROR_2001("20001", "提现金额不能为负数")
    ,Ol_USER_ERROR_2002("20002", "账户余额不足")
    ,Ol_USER_ERROR_2003("20003", "出金失败")
    ,Ol_USER_ERROR_2004("20004", "提现金额超出限制")
    ,Ol_USER_ERROR_2008("20001", "入金０以下になります")
    ,Ol_USER_ERROR_2005("20005", "入金金额超出限制")
    ,Ol_USER_ERROR_2006("20006", "账户余额超出限制")
    ,Ol_USER_ERROR_2007("20007", "入金失败");




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
