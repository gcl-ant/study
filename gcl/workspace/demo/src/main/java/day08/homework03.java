package day08;

public class homework03 {
    public static void main(String[] args) {
        System.out.println("100到500之间水仙花数:");

        for (int i = 100; i <= 500; i++) {
            if (Math.pow(i / 100, 3) + Math.pow(i / 10 % 10, 3) + Math.pow(i % 10, 3) == i) {
                System.out.println(i + " ");
            }
        }

        for (int i = 100; i <= 500; i++) {
            if (isNarcissisticNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // 判断一个数是否为水仙花数
    public static boolean isNarcissisticNumber(int n) {
        //定义一个变量 sum 用于记录数字的每个位上的数字的 n 次幂之和，初值为 0。
        int sum = 0;

        //定义一个变量 temp 用于记录当前正在处理的数字，初值为参数 n 的值。
        int temp = n;

        //计算参数 n 的位数，并将其赋值给变量 length。
        int length = String.valueOf(n).length();

        while (temp > 0) {
            //temp取余10
            int digit = temp % 10;
            //
            sum += Math.pow(digit, length);
            //并将 temp 除以 10，以便处理下一位数字。
            temp /= 10;
        }

        return sum == n;
    }
}
