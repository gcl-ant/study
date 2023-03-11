package org.demo0311;

import java.util.Arrays;
import java.util.Collections;

public class text0311 {
    public  static  void  main(String[]args) {
        int[] a={3,2,1,4,5};
        //i++(+1);i+=2(+2)
        for(int i=0;i<a.length;i+=2){
            System.out.println(a[i]);
        }
        System.out.println("----------排序----------");
        Arrays.sort(a);
        for(int s:a){
            System.out.println(s);
        }
        System.out.println("--------------------");
//        降序??
//        Arrays.sort(a,Collections.reverseOrder());

        int[] intArr3 = {1,3,5};
        for (int i = 0; i < intArr3.length; i++){
            System.out.println(intArr3[i]);
        }
        //增強For循環
        for (int n:intArr3){
            System.out.println(n);
        }
        System.out.println("--------------------");
        //算數
        int x = 0;
        int y = 0;
        int n = x++;
        int m = ++y;
        //a++ a+=1 a=a+1
        for(int s:intArr3){
            System.out.println(s);
//            System.out.println(x++);
//            System.out.println(++y);
        }
        System.out.println("--------------------");
        System.out.println(Boolean.TRUE&Boolean.TRUE);
        System.out.println(Boolean.TRUE&Boolean.FALSE);
        System.out.println(Boolean.TRUE&Boolean.FALSE);
        System.out.println(Boolean.TRUE|Boolean.TRUE);
        System.out.println(Boolean.TRUE|Boolean.FALSE);
        System.out.println(Boolean.FALSE|Boolean.FALSE);
        System.out.println(!(Boolean.TRUE|Boolean.TRUE));
        System.out.println(!(Boolean.TRUE|Boolean.FALSE));
        System.out.println(!(Boolean.FALSE|Boolean.FALSE));
        System.out.println("--------------------");
        String str1 = "666";
        String str2 = null;
        System.out.println(str1.length() == 1);
        System.out.println((str1.length() == 1 & true));
//        System.out.println("&&" + (!Objects.isNull(str2) && str2.length() == 1));
//        System.out.println("!|" + (!Objects.isNull(str2) & str2.length() == 1));
        System.out.println("||" + (true || str2.length() == 1));
//        System.out.println("|" + (true | str2.length() == 1));

//        作业1：
//        题目：编写代码验证String的特性：直接用=赋值，相同内容的字符串实际是一个对象；用new赋值，每次都创建一个新的对象。
//        考核点：字符串类，==作用
//        难度：中
//        作业2：
//        题目：编写代码，验证自动装箱/拆箱的概念。
//        考点：自动装箱/拆箱
//        难度：低
//        作业3：编写代码，声明一个int型数组，长度为3，使用三种方式为数组元素赋值为{1,2,3}；声明一个int型二维数组，一维和二维的长度分别是2和3，并分别进行赋值，具体值自行确定；
//        考点：数组的声明与创建
//        难度：低
    }
}