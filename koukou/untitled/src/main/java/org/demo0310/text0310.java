package org.demo0310;

import java.util.Arrays;

public class text0310 {
    public  static  void  main(String[]args) {

        //大量設定
        int a,b,c=3,d=4;
        System.out.println(c+d);

        //final用法
        final  int x=10;
        //一旦使用final賦值，就不能變更
        //X=1000;
        System.out.println(x);

        //JDK 1.7前
        StringBuffer sb1 = new StringBuffer("sb1");
        StringBuilder sb2 = new StringBuilder("sb2");
        sb1.append(sb2);
        System.out.println(sb1);

        //JDK 1.8
        String st1 = "a";
        String st2 = "b";
        String st3 = st1 + st2;
        System.out.println(st3);

        //-數組-
        int[] a1 = new int[]{1,2,3};
        int[] a2 = {10,20,30};//通常不+new
        Integer[] a3 = {new Integer(1),new Integer(2),new Integer(3)};
        System.out.println(a2[0]);

        Integer[][] a4 = {{10,11,12},{20,21},{30,31}};
        System.out.println(a4[0][0]);
        //找尋裡面有幾個的數值
        System.out.println(a4[0].length);
        //找尋該值為幾位數
        System.out.println(a4[0][0].toString().length());

        System.out.println("--------------------");
        //普通For循環
        for (int i = 0; i < a2.length; i++){
            System.out.println( a2[i] );
        }
        //增強For循環
        for (int n:a2){
            System.out.println(n);
        }

        //JDK8循環
        System.out.println("--------------------");
        Arrays.stream(a2).forEach(System.out::println);
        //LAMBDA
        System.out.println("--------------------");
        Arrays.stream(a2).forEach(item ->{System.out.println(item);});
        //Java API Arrays
        System.out.println("--------------------");
        Arrays.sort(a2);
        for(int s:a2){
            System.out.println(s);
        }

    }

    }