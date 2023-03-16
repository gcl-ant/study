package package1;

import com.sun.javafx.geom.Curve;

public class homework {
    public static void main(String[] args) {
    //作业1：
        //题目：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子。
        // 假如兔子都不死，要求输出一年内兔子的数量是多少。
        //考点：流程控制
        //难度：中
        int mon1=1;
        int mon2=1;
        int mon3=2;
        for (int month=1; month<=12;month++){
            if (month>3);{
                mon3=mon1+mon2;
                mon1=mon2;
                mon2=mon3;
            }
        }
        System.out.println(mon3);
//作业6：
//题目：输出2000年到3000年中的闰年。
//考点：流程控制、运算符
//难度：中

        for ( int year =2000; year<=3000;year++){
             if ((year%4==0 &&year%100!=0)||year%400==0){
                 System.out.println(year);
             }
         }
    }
}

