package Demo03.Demo0314;

import java.util.Arrays;

public class Homework0314 {
    public static void main(String[] args) {
//        int str1 = 123;
//        String str2 = String.valueOf(123);
//        char str3 = str2.charAt(1);
//        System.out.println(str2.charAt(1));

        int i01 = 214365;
        String i02 = String.valueOf(i01);
//        int i03 = i02.length();
        char[] str11 = new char[i02.length()];
        for (int aa = 0 ; aa <= 9 ; aa++){
            str11[aa] = i02.charAt(aa);
            aa = aa + 0;
            System.out.println(str11[1]);
//            Arrays.sort(str11);
//            for(int x:str11){
//                System.out.println(x);
//            }
        }
//        int p = 123456;
//        String q = String.valueOf(p);
//        System.out.println(q.length()+"位數");
//        int[] i1 = new int[i02.length()];
//        String[] str2 = {str1};
//        for (int r = q.length()-1; r >= 0 ; r--){
//            System.out.print(q.charAt(r));
//        }
//        降序??
//        Arrays.sort(a,Collections.reverseOrder());
//        int[] intArr = {1,3,5,7,9};
//        for (int i = 0; i < intArr.length; i++){
//            System.out.println(intArr[i]);


//            int n = 444555666;
//            int reverse = 0;
//            int digit = 0;
//            boolean isNegative = false;
//            // 如果输入的整数是负数，先转换为正数
//            if (n < 0) {
//                n = -n;
//                isNegative = true;
//            }
//            while (n != 0) {
//                reverse = reverse * 10 + n % 10;
//                n = n / 10;
//                digit++;
//            }
//            System.out.println("该整数是 " + digit + " 位数。");
//            // 如果输入的整数是负数，输出时加上负号
//            if (isNegative) {
//                System.out.println("它的逆序数是 -" + reverse + "。");
//            } else {
//                System.out.println("它的逆序数是 " + reverse + "。");
//            }
//        int startYear = 2000;
//        int endYear = 3000;
//        for (int year = startYear; year <= endYear; year++) {
//            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
//                System.out.println(year + " 是闰年。");
//            }
//        }
    }
}
