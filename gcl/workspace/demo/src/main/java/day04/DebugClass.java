package day04;

import day2.Test12;

public class DebugClass {

    public static void main(String[] args) {

        Test12 test1 = new Test12();
        System.out.println("------------String + 号的作用--------------");
        String str111 = "hello ";
        String str222 = "word ";
        System.out.println(str111 + str222);// True

        // 2.数值的计算
        int i111 = 111;
        int i112 = 112;
        System.out.println(i111 + i112);// True

        Integer ix111 = 111;
        Integer ix112 = 112;
        System.out.println(ix111 + ix112);// True


        int  a,b,c,d;

        int[]  a1={10,45,23};


        //final 最终类型  他的意思是，一旦进行赋值就无法变更
        final  int x1=10;
//        x1=1000;//编译错误，final修饰x后即为常量，不能被修改
        System.out.println(x1);


    }
}
