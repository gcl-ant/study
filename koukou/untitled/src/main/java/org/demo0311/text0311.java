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

        int[] intArr = {1,3,5};
        for (int i = 0; i < intArr.length; i++){
            System.out.println(intArr[i]);
        }
        for (int n:intArr){
            System.out.println(n);
        }
        System.out.println("--------------------");
        //算數
        int x = 0;
        int y = 0;
        //a++ a+=1 a=a+1
        for (int s = 0; s < intArr.length; s+=2){
            System.out.println(intArr[s]);
        }
//        for(int s:intArr){
//            int s1 = x++;
//            int s2 = ++y;
//            System.out.println(s);
//            System.out.println(x++);
//            System.out.println(++y);
//        }
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
    }
}