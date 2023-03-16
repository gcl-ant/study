package day08;

public class Homework02 {

    public static void main(String[] args) {
        //判断10-105之间有多少个素数，并输出所有素数。
        System.out.println("10到105之间的素数有:");
        int count = 0;
        for (int i = 10; i <= 105; i++) {
            boolean findFlag = true;
            // 找约数  15  1  ---14  2  -- i-1
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    findFlag = false;
                    break;
                }
            }
            if (findFlag) {
                //找到了之后对个数进行+1
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("10-105之间的所有素数有" + count + "个");

        count = 0;
        for (int i1 = 10; i1 <= 105; i1++) {
            boolean findFlag = true;
            for (int j1 = 2; j1 <= i1; j1++) {
                if (i1 % j1 == 0 && i1 != j1) {
                    findFlag = false;
                    break;
                }

            }
            if (findFlag) {
                //找到了之后对个数进行+1
                count++;
                System.out.println("质数：i1= " + i1);
            }
        }
        System.out.println();
        System.out.println("10-105之间的所有素数有" + count + "个");

        for (int i1 = 10; i1 <= 105; i1++) {
            for (int j1 = 2; j1 <= i1; j1++) {
                if (i1 % j1 == 0 && i1 != j1) {
                    break;
                }
                if (j1 == i1) {
                    System.out.println("质数：i1= " + i1);
                }
            }
        }

        for (int num = 10 ; num <= 105 ; num++) {
            if ( num%2 > 0 && num%3 > 0 && num%5 > 0 && num%7 > 0){
                System.out.print(num+" ");
            }
        }

        System.out.println("------------------------");
        count = 0;
        for (int i = 10; i <= 105; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\n共有 " + count + " 个素数。");
    }


    // 判断一个数是否为素数
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        //  2 -- i-1   2 ---根号i
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
