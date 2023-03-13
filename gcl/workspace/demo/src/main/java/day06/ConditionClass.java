package day06;

public class ConditionClass {

    public static void main(String[] args) {
        //条件分支
        //if
        int a = 1;

        System.out.println("------------------if else  --------------------------begin");
//        if (a > 1 ){
        if (a == 1) {
            System.out.println("1满足条件 a> 1");
        } else {
            System.out.println("1不满足条件 a> 1");
        }
        System.out.println("------------------if else  --------------------------end");

        System.out.println("------------------if   --------------------------begin");
//        if (a > 1 ){
        if (a == 1) {
            System.out.println("2满足条件 a> 1");
        }

        System.out.println("2不满足条件 a> 1");

        System.out.println("------------------if   --------------------------begin");


        System.out.println("------------------if elseif else  --------------------------begin");
//        if (a > 1 ){
        if (a == 1) {
            System.out.println("2满足条件 a> 1");
        } else if (a == 2) {
            System.out.println("2满足条件 a== 2");
        } else {
            System.out.println("其他情况");
        }

        System.out.println("2不满足条件 a> 1");

        System.out.println("------------------if   --------------------------begin");
        System.out.println("------------------if elseif else  --------------------------begin");
//        if (a > 1 ){
        if (a == 1) {
            System.out.println("2满足条件 a> 1");
        } else if (a == 2) {
            System.out.println("2满足条件 a== 2");
        }

        System.out.println("2不满足条件 a> 1");

        System.out.println("------------------if   --------------------------begin");
        String str = "hj";
        switch (str) {
            case "hj":
                System.out.println("aaa === 111");
                break;
            case "b":
                System.out.println("aaa === 222");
                break;
            case "c":
                System.out.println("aaa === 333");
                break;
            case "d":
                System.out.println("aaa === 444");
                break;
            case "e":
                System.out.println("aaa === 555");
                break;
            //不满足任何一个条件时候，会执行到default的语句
            default:
                System.out.println("aaa === default");
        }

        //作用域
        String strStr = "abc";

        int myint = 5;
        if (strStr.length() == 3) {
            myint = 10;

            int myint2 = 5;

            myint2 = myint;

        }
//        myint2 = 3;
        String strStr2 = "abc";

        int sanyuan = 0;

        sanyuan = strStr2.length() > 1 ? 1 : 2;
        System.out.println("三元运算符 " + sanyuan);

//        for(;;){
//            System.out.println("xxxx");
//        }

        int b = 0;
        while (b < 5) {
            System.out.println("b=" + b);
            b++;
        }


        int c = 0;
        do {
            System.out.println("c=" + c);
            c++;
        } while (c < 5);


//        while( true ){
//            System.out.println("b="+b);
//            b++;
//        }


        for (int i = 0; i < 3; i++) {

            for (int j = 5; j > 0; j--) {
                System.out.println("i=" + i + "  j=" + j);
            }
            System.out.println("结束i的第" + i + "次循环");
        }
        System.out.println("结束所有i循环");


        for (int i = 0; i < 5; i++) {
            //判断i是偶数
            if (i % 2 == 0) {
                //如果i是偶数，则继续下一次循环
                continue;
            }
            //输出i的值
            System.out.println("i=" + i);
        }

        for (int i = 0; i < 5; i++) {
            //判断i是偶数
            if (i % 2 == 0) {
                //如果i是偶数，则继续下一次循环
                break;
            }
            //输出i的值
            System.out.println("i=" + i);
        }

        for(int i=0;i<5;i++){
            for(int j=0;j<6;j++){
                //当i==j时，继续j循环
                if(i==j){
                    continue;
                }
                System.out.println("i="+i+" j="+j);
            }
            System.out.println("结束i循环的第"+i+"次循环");
        }
        System.out.println("结束i循环");



        for(int i=0;i<5;i++){
            for(int j=0;j<6;j++){
                //当i==j时，继续j循环
                if(i==j){
                    break;
                }
                System.out.println("i="+i+" j="+j);
            }
            System.out.println("结束i循环的第"+i+"次循环");
        }
        System.out.println("结束i循环");


        for(int i=0;i<5;i++){
            for(int j=0;j<6;j++){
//当i==j时，终止j循环
                if(i==j){
                    break;
                }
                System.out.println("i="+i+" j="+j);
            }
            System.out.println("结束i循环的第"+i+"次循环");
        }
        System.out.println("结束i循环");

    }



}
