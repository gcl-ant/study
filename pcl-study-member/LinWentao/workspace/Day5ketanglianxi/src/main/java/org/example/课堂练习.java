package org.example;

public class 课堂练习 {
    public static void main(String[] args) {
        //复习 创建数组 3种
        // 第一种：数组元素类型[ ] 变量名称=new 数组元素类型[数组长度];

        //第二种：数组元素类型[ ] 变量名称=new 数组元素类型[]{用逗号隔开元素的具体值};

        //第三种：数组元素类型[ ] 变量名称= {用逗号隔开元素的具体值};

        int[] a1=new int[]{1,2,5};
        int[] a2={4,5,6};

        //复习for 循环
        //基础
        for(int i=0;i<a1.length;i++){
            System.out.println(a1[i]);
            System.out.println("=====");

            //增强for循环

            for(int x:a2){
                System.out.println(x);
            }
        }
    }
}