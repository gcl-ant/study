package Day6;

public class Day6homework {
    public static void main(String[] args) {

    //作业1：
    //题目：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子。假如兔子都不死，要求输出一年内兔子的数量是多少。
    //考点：流程控制
    //输入月份2<n<13
    // 输出的是n=12时 兔子对数
    /*月份      兔子个数
    1          1
    2          1
    3          1（成熟的兔子b，可以生新兔子）+1=2
    4          1（b）+1+1=3
    5          1（b）+1(b)+ 1+1 +1=5
    前两个和等于第三个月总数

    */
    int month1=1;//1对
    int month2=1;
    int month3=0;
    for(int i=3;i<13;i++){

            month3 = month1 + month2;
            month1 = month2;
            month2 = month3;

    }
    System.out.println("一年后兔子有"+month3+"对");
    }





}
