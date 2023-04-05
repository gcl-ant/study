package Day6;

public class Day6homework {
    public static void main(String[] args) {

        //作业1：
      /*题目：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子。假如兔子都不死，要求输出一年内兔子的数量是多少。
        考点：流程控制
        输入月份2<n<13
        输出的是n=12时 兔子对数

    月份      兔子个数
    1          1
    2          1
    3          1（成熟的兔子b，可以生新兔子）+1=2
    4          1（b）+1+1=3
    5          1（b）+1(b)+ 1+1 +1=5
    前两个和等于第三个月总数

    */
 /*       int month1 = 1;//1对
        int month2 = 1;
        int month3 = 0;
        for (int i = 3; i <= 12; i++) {

            month3 = month1 + month2;
            month1 = month2;
            month2 = month3;

        }
        System.out.println("一年后兔子有" + month3 + "对");*/


    /* 作业2：
    题目：判断10-105之间有多少个素数，并输出所有素数。
    【素数又称为质数，定义为在大于1的自然数中，除了1和它本身以外不再有其他因数的数】
    考点：流程控制、运算符
    */
        int count = 0; //计算素数的个数
        int i1, j;
        for (i1 = 10; i1 <= 105; i1++) {
            for (j = 2; j < i1; j++) {
                if (i1 % j == 0)    //i除j余数为0 不是素数
                    break;
            }
            if (i1 <= j) {
                System.out.println(i1 + "是素数");
                count++;
            }
        }
        System.out.println("共有" + count + "个素数");

    //讲解
    /*    for (int i = 10; i <= 105; i++) {
            boolean temp = true;
            for (int j = 2; j < i; j++) {
                if(i % j == 0){
                    temp = false;
                    break;
                }
            }
            if(temp == true){
                System.out.print(i + " ");
            }
        }*/

    /* 作业3：
    题目：判断100到500之间，哪些数是水仙花数。
    【水仙花数是指一个 n 位正整数 ( n≥3 )，它的每个位上的数字的 n 次幂之和等于它本身。（例如：1^3 + 5^3+ 3^3 = 153）】
    考点：流程控制、运算符
    数 abc
    个位数a：abc%10;
    十位数b: (abc/10)%10;
    百位数c: abc/100;
*/
        for (int i2 = 100; i2 <= 500; i2++) {
            int a = i2 % 10;
            int b = (i2 / 10) % 10;
            int c = i2 / 100;
            if (i2 == a * a * a + b * b * b + c * c * c) {  ////各位数的立方和等于本身则是水仙花数
                {
                    System.out.print(i2 + "是水花仙数\n");
                }
            }
        }

    /* 作业4：
    题目：求1-100之间，有哪些数是完数。
    完全数（Perfect number），又称完美数或完备数，是一些特殊的自然数。
    它所有的真因子（即除了自身以外的约数）的和（即因子函数），恰好等于它本身。例如：6=1+2+3
    考点：流程控制、运算符
    */ // 求真因子 和 求真因子和
        for (int i3 = 1; i3 <= 100; i3++) {
            int sum = 0;
            for (int j1 = 1; j1 < i3; j1++) {
                if (i3 % j1 == 0) {  //是真因子数
                    sum += j1;
                }
            }
            if (sum == i3) {
                System.out.println(i3 + "是完美数");
            }
        }


    /*作业5：
    //题目：判断一个整数是几位数，并按照逆序输出。
    //考点：流程控制、运算符、数组
*/
        int a = 1234566;
        String num = String.valueOf(a);
        System.out.println("这个数是" + num.length() + "位数");
        if (a >= 0 && a <= 9) {
            System.out.println(a + "是一位数");
        } else if (a >= 10 && a <= 99) {
            System.out.println(a + "是二位数");
        } else if (a >= 100 && a <= 999) {
            System.out.println(a + "是三位数");
        } else if (a >= 1000 && a <= 9999) {
            System.out.println(a + "是四位数");
        } else if (a >= 10000 && a <= 99999) {
            System.out.println(a + "是五位数");
        }

        //switch
        System.out.println("=======switch======");
        switch (a) {
            case 1:
                System.out.println("a >= 0 && a <= 9");
                System.out.println(a + "是一位数");
                break;
            case 2:
                System.out.println("a >= 10 && a <= 99");
                System.out.println(a + "是二位数");
                break;
            case 3:
                System.out.println("a >= 100 && a <= 999");
                System.out.println(a + "是三位数");
                break;
            case 4:
                System.out.println(a >= 1000 && a <= 9999);
                System.out.println(a + "是四位数");
                break;
            case 5:
                System.out.println(a >= 10000 && a <= 99999);
                System.out.println(a + "是五位数");
                break;
        }

            //另一种 方法  每次都整除10，用计数器计数。
            int b = 123456;
            int c = b;
            int i5 = 0;
            while (c > 0) {
                c /= 10;
                i5++;
            }
        System.out.println("这是一个" + i5 + "位数");
        }

    }




