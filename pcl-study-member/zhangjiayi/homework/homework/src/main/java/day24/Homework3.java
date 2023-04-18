package day24;

public class Homework3 {

    public static String getMaxCommonSubstring(String s1, String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1]; // 构建动态规划表
        int maxLen = 0; // 最大公共子串长度
        int endIndex = 0; // 最大公共子串结束位置
        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1; // 相同字符，更新状态转移方程
                    if (dp[i][j] > maxLen) { // 如果当前公共子串更长，更新最大公共子串长度和结束位置
                        maxLen = dp[i][j];
                        endIndex = i - 1;
                    }
                } else {
                    dp[i][j] = 0; // 不相同字符，公共子串长度为0
                }
            }
        }
        return s1.substring(endIndex - maxLen + 1, endIndex + 1); // 返回最大公共子串
    }

    public static void main(String[] args) {
        String s1 = "abegad";
        String s2 = "acegab";
        String maxCommonSubstring = getMaxCommonSubstring(s1, s2);
        System.out.println(maxCommonSubstring); // 输出 "ega"
    }
}


