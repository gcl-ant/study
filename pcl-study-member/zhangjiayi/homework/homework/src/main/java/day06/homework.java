package day06;

public class homework {
    public static void main(String[] args) {
        System.out.println("----------------01-------------");
        int month = 12; // 计算12个月内的兔子数量
        int[] rabbits = new int[month]; // 存储每个月的兔子数量
        rabbits[0] = 1; // 第一个月有一对兔子
        rabbits[1] = 1; // 第二个月有一对兔子
        for (int i = 2; i < month; i++) {
            rabbits[i] = rabbits[i - 1] + rabbits[i - 2]; // 每个月兔子数量等于上个月和上上个月的兔子数量之和
        }
        System.out.println("一年内兔子的数量是：" + rabbits[month - 1] * 2); // 输出12个月后的兔子数量，乘2是因为每对兔子都会生出一对新的兔子

        System.out.println("----------------01-------------");

        System.out.println("----------------02-------------");
        for (int i1 = 5; i1 <= 105; i1++) {
            for (int j1 = 2; j1 <= i1; j1++) {
                if (i1 % j1 == 0 && i1 != j1) {
                    break;
                }
                if (j1 == i1) {
                    System.out.println("质数：i1= " + i1);
                }
            }
        }
        System.out.println("----------------02-------------");

        System.out.println("----------------03-------------");


        for (int i2 = 100; i2 <= 500; i2++) {
            int a2 = i2 % 10;
            int b2 = i2 / 10 % 10;
            int c2 = i2 / 100;
            int j2 = a2 * a2 * a2 + b2 * b2 * b2 + c2 * c2 * c2;
            if (j2 == i2) {
                System.out.println(j2 + "为水仙花数 ");
            }
        }
        System.out.println("----------------03-------------");

        System.out.println("----------------04-------------");
        for (int i3 = 1; i3 <= 100; i3++) {
            int sum =0;
            for (int j3 = 1; j3 < i3; j3++) {
                if (i3 % j3 == 0) {
                    sum += j3;
                }
            }
            if (sum == i3) {
                System.out.println(i3 + "是完美数");
            }


        }
        System.out.println("----------------04-------------");

        System.out.println("----------------05-------------");
            int number = -1234567;
            int digits = 0;
            int temp = number;
            while (temp != 0) {
                digits++;
                temp /= 10;
            }
            System.out.println("这是一个" + digits + "位数。");
            System.out.print("逆序输出为：");
            if (number<0)
            {number=-number;
            System.out.print("-");}
            while (number != 0) {
                System.out.print(number % 10);
                number /= 10;
            }
        System.out.println("----------------05-------------");

        System.out.println("----------------06-------------");

            for (int i6 = 2000; i6 <= 3000; i6++) {
                if (i6 % 4 == 0 && i6 % 100 != 0 || i6 % 400 == 0) {
                    System.out.println(i6 + "是闰年");
                }
            }

        System.out.println("----------------06-------------");
        }
    }
