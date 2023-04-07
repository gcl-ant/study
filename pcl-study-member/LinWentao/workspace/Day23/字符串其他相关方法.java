package Day23;

import java.util.Arrays;

public class 字符串其他相关方法 {
    public static void main(String[] args) {
        String word1 = "hi beautiful";
        String word2 = "hi mm beautiful";
        String word3 = "   hi   ";

        // compareTo method  比较两个字符串的字典顺序，返回值为正数，表示大于
        int result = word1.compareTo(word2);
        System.out.println(result); // -11

        // endsWith method   判断一个字符串是否以suffix结尾
        boolean endsWithWorld = word1.endsWith("f");
        System.out.println(endsWithWorld); // false
        boolean endsWithworld = word1.endsWith("fl");
        System.out.println(endsWithworld); // false

        // getBytes method   将字符串转换为byte数组
        byte[] bytes = word1.getBytes();
        System.out.println(Arrays.toString(bytes)); // [104, 105, 32, 98, 101, 97, 117, 116, 105, 102, 117, 108]

        //将字符串用指定的编码格式转换为byte数组
        String code = "UTF-8";
       /* byte[] bytes2 = word1.getBytes(code);*/

        // length method     返回字符串的长度
        int length = word1.length();
        System.out.println(length); // 12

        // startsWith method 判断字符串是否以prefix开头
        boolean startsWithHello = word1.startsWith("be");
        System.out.println(startsWithHello); // False
        boolean startsWithhello = word1.startsWith("be");
        System.out.println(startsWithhello); // false

        // startsWith method with offset  判断字符串中从toffset个字符开始后的子串中，是否以prefix开头
        boolean startsWithWorld = word1.startsWith("hi", 6);
        System.out.println(startsWithWorld); // False

        // trim method  将字符串的首位空格去掉
        String trimmedStr = word3.trim();
        System.out.println(trimmedStr); // "hi"
    }
}

