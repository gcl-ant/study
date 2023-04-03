package org.example;

public class 课堂作业 {
    public static void main(String[] args) {


    //作业1：
    //题目：编写代码验证String的特性：直接用=赋值，相同内容的字符串实际是一个对象；用new赋值，每次都创建一个新的对象。
    //考核点：字符串类，==作用

    System.out.println("作业1");
    String a="2";
    String a2=new String("2");
    System.out.println(a==a2);
    System.out.println(a.equals(a2));  //比较值

    //作业3：
    //题目：编写代码，验证自动装箱/拆箱的概念
    //考点：自动装箱/拆箱

    System.out.println("作业3");
    int[] a3={1,2,3};
    for(Integer item:a3) {
        System.out.println(item);

    }
    Integer[] b1={4,5,6};
    for (int item2:b1) {
        System.out.println(item2);
    }

    //作业4：编写代码，声明一个int型数组，长度为3，使用三种方式为数组元素赋值为{1,2,3}；
    // 声明一个int型二维数组，一维和二维的长度分别是2和3，并分别进行赋值，具体值自行确定；
    //考点：数组的声明与创建
        System.out.println("作业4");
        int[] c=new int[3];
        c[0]=1;
        c[1]=2;
        c[2]=3;
        for(int item3:c){
            System.out.println(item3);
        }

        int[] c2={1,2,3};
        int[] c3=new int[]{1,2,3};
        int[][] d1={{1},{2}};

        //二维数组 一维和二维的长度分别是2和3

        int[][] d={{1,2,3},{4,5,6}}; //第一种方法 类型 数组名[][] = {{值 1,值 2..},{值 1,值 2..},{值 1,值 2..}}
        int[][] dd=new int[2][3];

        //没有赋值 默认
        int[][] arr = new int[2][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = j;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }


        int[][] arr1 = new int[2][3];
        arr1[0][0] = 0;
        arr1[0][1] = 1;
        arr1[1][0] = 2;
        arr1[1][1] = 3;
        arr1[1][2] = 4;
        for (int[] x:arr1){
            for (int y:x)
            System.out.println(y);
            }




    }

    }




