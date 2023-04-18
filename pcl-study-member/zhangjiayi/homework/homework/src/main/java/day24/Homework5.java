package day24;

import java.nio.charset.StandardCharsets;

public class Homework5 {
    public static String truncateString(String str, int byteCount) {
        if (str == null || byteCount <= 0) {
            return "";
        }

        int len = str.length();
        int byteLen = 0;
        int index = 0;

        while (index < len && byteLen < byteCount) {
            char c = str.charAt(index);
            byteLen += c < 256 ? 1 : 2;
            index++;
        }

        // 如果截取位置处于一个汉字的一半，向前退一位
        if (byteLen > byteCount) {
            index--;
        }

        return str.substring(0, index);
    }




    public static void main(String[] args) {
        String str = "我ABC汉语DEF";
        int byteCount = 7;
        String result = truncateString(str, byteCount);
        System.out.println(result);

    }



}
