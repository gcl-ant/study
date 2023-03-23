package day0313;

public class homework {

    public static void main(String[] args) {
/*作业1：
题目：有一对兔子，从出生后第3个月起每个月都生一对兔子，
小兔子长到第三个月后每个月又生一对兔子。假如兔子都不死，
要求输出一年内兔子的数量是多少。
考点：流程控制
难度：中*/

        int first = 2;
        int second = 2;
        int third = 0;
        for (int month = 1; month <= 12 ; month ++){
            if (month >= 3){
                third = first+second;
                first = second;
                second = third;
            }
        }
        System.out.println("一年后兔子数量为"+third);

/*作业2：
题目：判断10-105之间有多少个素数，并输出所有素数。【素数又称为质数，定义为在大于1的自然数中，除了1和它本身以外不再有其他因数的数】
考点：流程控制、运算符
难度：中*/

                // 记录素数的个数
                int count = 0;
                for (int i = 10; i <= 105; i++) {
                    // 标记变量，记录i是否为素数
                    boolean is = true;
                    for (int j = 2; j < i; j++) {
                        if (i % j == 0) {
                            // i能被j整除，说明i不是素数
                            is = false;
                            break;
                        }
                    }
                    if (is) {
                        count++;
                        System.out.println(i + "是素数。");
                    }
                }
                System.out.println("10到105之间共有" + count + "个素数。");


/*作业3：
题目：判断100到500之间，哪些数是水仙花数。【水仙花数是指一个 n 位正整数 ( n≥3 )，它的每个位上的数字的 n 次幂之和等于它本身。（例如：1^3 + 5^3+ 3^3 = 153）】
考点：流程控制、运算符
难度：中*/


                for (int i = 100; i <= 500; i++) {
                    // 百位数
                    int digit1 = i / 100;
                    // 十位数
                    int digit2 = (i / 10) % 10;
                    // 个位数
                    int digit3 = i % 10;
                    int sum = digit1 * digit1 * digit1 + digit2 * digit2 * digit2 + digit3 * digit3 * digit3;
                    if (sum == i) {
                        System.out.println(i + "是水仙花数。");
                    }
                }


/*作业4：
题目：求1-100之间，有哪些数是完数。【完全数（Perfect number），又称完美数或完备数，是一些特殊的自然数。它所有的真因子（即除了自身以外的约数）的和（即因子函数），恰好等于它本身。例如：6=1+2+3】
考点：流程控制、运算符
度：中*/

                for (int i = 1; i <= 100; i++) {
                    // 记录i的真因子之和
                    int sum = 0;
                    for (int j = 1; j <= i / 2; j++) {
                        if (i % j == 0) {
                            // j是i的真因子，记入到sum中
                            sum += j;
                        }
                    }
                    if (sum == i) {
                        System.out.println(i + "是完数");
                    }
                }


/*作业5：
题目：判断一个整数是几位数，并按照逆序输出。
考点：流程控制、运算符、数组
难度：中*/
        int n = -123456789;
        int reverse = 0;
        int digit = 0;
        boolean isNegative = false;
// 如果输入的整数是负数，先转换为正数
        if (n < 0) {
            n = -n;
            isNegative = true;
        }
        while (n != 0) {
            reverse = reverse * 10 + n % 10;
            n = n / 10;
            digit++;
        }
        System.out.println("该整数是 " + digit + " 位数。");
// 如果输入的整数是负数，输出时加上负号
        if (isNegative) {
            System.out.println("它的逆序数是 -" + reverse + "。");
        } else {
            System.out.println("它的逆序数是 " + reverse + "。");
        }
/*作业6：
题目：输出2000年到3000年中的闰年。
考点：流程控制、运算符
难度：中*/
        int start=2000;
        int end=3000;
        for (int year = start; year <= end; year++){
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                System.out.println(year+"是闰年。");
            }
        }


    }
}