package package1;

public class day7 {
    public static void main(String[] args) {
        // 条件分支 if/else 用法
        int xitou = 1;
        if (xitou==1){
            System.out.println("满足条件");
        }
        else {
            System.out.println("不满足条件");
        }
        // switchi/case用法 先设置一个值，可能性值是什么的话输出——————break；退出循环
        String LIUSITONG="L";
        switch (LIUSITONG){
            case "L":
                System.out.println("刘思彤");
                break;
            case "A":
                System.out.println("刘艺洋");
                break;
            default:
                System.out.println("不满足任何条件则输出default");
        }
        //循环 for循环  for(初始化语句；判断条件语句；控制语句){
        //    循环体语句块；
        //}
        // while 循环
        int b=0;
        while(  b<5  ){
            System.out.println("b="+b);
            b++;
        }
        //continue;在循环控制语句的循环体中，可以使用continue语句，表示不再继续循环体后面的代码，继续下一次循环
        for(int i=0;i<5;i++){
             //判断i是偶数
            if(i%2==0){
             //如果i是偶数，则继续下一次循环
                continue;
            }
             //输出i的值
            System.out.println("i="+i);
        }
        int[]inArr11={1,2,3};
//        for循环
        for (int i=0; i<inArr11.length;i++){
            System.out.println("当前下标是"+i+"对应的数组值是"+inArr11[i]);
        }
        //for 增强循环演示
        int x[] = { 1,2,3,4,5,6,7,8,9};
        for (int arr : x){
            System.out.println(x);
        }


    }
//数组类型
        int[] inArr1=new int[2];
        int[] inArr2=new int[]{1,2,3};

    }


