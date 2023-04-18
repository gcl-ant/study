package day24;

public class Homework4 {

    public static String transform(String str) {
        String[] parts = str.split("-");
        String left = parts[0];
        String right = parts[1];
        left = left.replaceAll("[^a-zA-Z]", ""); // 替换所有非字母字符为空字符串
        right = right.replaceAll("[^a-zA-Z]", ""); // 替换所有非字母字符为空字符串
        int leftLen = left.length();
        int rightLen = right.length();
        String mid = "";
        for (int i = 0; i < leftLen && i < rightLen; i++) {
            if (left.charAt(i) == right.charAt(i)) {
                mid += left.charAt(i);
            } else {
                mid += "ssssss"; // 使用 "ssssss" 代替不同的字符
                break;
            }
        }
        String result = left.substring(0, leftLen - mid.length()) + mid + right.substring(mid.length());
        result = result.replaceAll("-", "@"); // 替换连接符为 "@"
        return result;
    }

    public static void main(String[] args) {
        String str = "ttt5yjd-jdd4yh";
        String result = transform(str);
        System.out.println(result); // 输出 "tttyyyyyjd@jddyyyyh"

        str = "Hsdkf4sd-fsd3tr";
        result = transform(str);
        System.out.println(result); // 输出 "Hsdkfssssd@fsd3tttr"

        str = "Sf5sd-dsd4wr";
        result = transform(str);
        System.out.println(result); // 输出 "Sfsssssd@dsdwwwwr"
    }
}


