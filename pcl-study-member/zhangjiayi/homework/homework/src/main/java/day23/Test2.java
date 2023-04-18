package day23;

public class Test2 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "def";
        String str3 = "abc";
        int result1 = str1.compareTo(str2); // 返回一个小于0的整数
        int result2 = str2.compareTo(str1); // 返回一个大于0的整数
        int result3 = str1.compareTo(str3); // 返回0
        String str = "hello world";
        boolean result4 = str.endsWith("world"); // 返回true
        boolean result6 = str.endsWith("World"); // 返回false
        String str4 = "hello world";
        byte[] bytes = str.getBytes();
        String str5 = "hello world";
//        Charset utf8 = Charset.forName("UTF-8");
//        byte[] bytes1 = str.getBytes(utf8);



    }
}
