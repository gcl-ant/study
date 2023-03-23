package day07;

public class homework {

    public static void main(String[] args) {
//        int n = 0;
//        int reverse = 0;
//        int digit = 0;
//        boolean isNegative = false;
//        // 如果输入的整数是负数，先转换为正数
//        if (n < 0) {
//            n = -n;
//            isNegative = true;
//        }
//        while (n != 0) {
//            reverse = reverse * 10 + n % 10;
//            n = n / 10;
//            digit++;
//        }
//        System.out.println("该整数是 " + digit + " 位数。");
//        // 如果输入的整数是负数，输出时加上负号
//        if (isNegative) {
//            System.out.println("它的逆序数是 -" + reverse + "。");
//        } else {
//            System.out.println("它的逆序数是 " + reverse + "。");
//        }
//        System.out.println("");
//        System.out.println("-----作業六-----");
//        System.out.println("閏年：");
//        for (int m = 2000; m <= 3000; m++) {
//            if (m % 4 == 0) {
//                int n = m;
//                if (n % 100 > 0) {
//                    int o = n;
//                    System.out.println(o);
//                } else if (n % 400 == 0) {
//                    int o = n;
//                    System.out.println(o);
//                }
//            }
//        }
//        int startYear = 2000;
//        int endYear = 3000;
//        for (int year = startYear; year <= endYear; year++) {
//            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
//                System.out.println(year + " 是闰年。");
//            }
//        }
        int num1 = 2;
        int num2 = 2;
        int numt = 0;
        for (int month = 1; month <= 12 ; month++) {
            if (month >= 3){
                numt = num1 + num2;
                num1 = num2;
                num2 = numt;
            }
        }
        System.out.println("一年以后兔子的数量为:" + numt);
        

    }
}
