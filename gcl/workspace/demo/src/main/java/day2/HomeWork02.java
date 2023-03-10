package day2;

public class HomeWork02 {

    //作业
    //1。打印出所有基本类型的变量
    //2。打印出所有基本类型的包装类型
    //3。使用== != > < >= <= 来对基本类型进行比较【选3组】
    //4。使用== !=来对引用类型进行比较
    //5。使用 equal来对String的变量进行比较
        //  2 周  java  24   14
        // serlet web 组件 java   java web  1周  24   14
        // 数据库  mysql     2 周
        // framework 框架  SSM  spring springmvc mybatis   2z周
        // herbimate ORM
        // 日语  对日 1个月  流重载
        // python aws
        // CICD   git  ----> 服务器   7年


    public static void main(String[] args) {

            // byte short int long float double char boolean
            //
            // 10    数字           int
            //1.2    浮点数字 小数   double

            float f = 1.2F;

            byte b1 = 10;
            short s1 = 0;
            int i1 = 0;
            long l1 = 0;
            float f1 = 0;
            double d1 = 0;
            char c1 = 0;
            boolean be1 = false;

            System.out.println(b1);
            System.out.println(s1);
            System.out.println(i1);
            System.out.println(l1);
            System.out.println(f1);
            System.out.println(d1);
            System.out.println(c1);
            System.out.println(be1);
            System.out.println("--------------------------");
            Byte b11 = new Byte("1");
//            Byte b111 = null;
//            if ( 1< 1){
//                    b11 = new Byte("1");
//            }
            Short s11 = new Short("1");
            Integer i11 = new Integer("1");
            Long l11 = new Long("111");
            Long l12 = new Long("111");
            Long l13 = new Long("112");
            Float f11 = new Float("0.1111");
            Double d11 = new Double("0.1111");
            Character c11 = new Character('c');
            Boolean be11 = new Boolean("true");

            System.out.println(b11);
            System.out.println(s11);
            System.out.println(i11);
            System.out.println(l11);
            System.out.println(f11);
            System.out.println(d11);
            System.out.println(c11);
            System.out.println(be11);
            System.out.println("--------------------------");
            System.out.println("------------基本类型的比较--------------");
            System.out.println(b1 == s1);
            System.out.println(b1 != s1);
            System.out.println(b1 >= s1);
            System.out.println(b1 <= s1);

            System.out.println("------------包装类型的比较--------------");
            System.out.println(l11 == l12);
            System.out.println(l11 != l12);
            System.out.println(b11 >= s11);
            System.out.println(b11 <= s11);
            System.out.println("------------包装类型Equals的比较--------------");
            System.out.println(l11.equals(l12));
            System.out.println(l11.equals(l13));

            //jdk 1.7
            String str1 = "aaa";
            String str2 = "bbb";
            String str3 = "aaa";
            System.out.println("------------String 变量类型Equals的比较1--------------");
            System.out.println(str1.equals(str2)); // false
            System.out.println(str1.equals(str3));// True
            System.out.println(str1 == str2);// false
            System.out.println(str1 == str3);// true  非常重要


            String str12 = new String("aaa");
            String str22 = new String("bbb");
            String str32 = new String("aaa");
            System.out.println("------------String 变量类型Equals的比较2--------------");
            System.out.println(str12.equals(str22)); // false
            System.out.println(str12.equals(str32));// True
            System.out.println(str12 == str22);// false
            System.out.println("result :" + (str12 == str32));// false  非常重要


            // +
            //1.拼接字符串
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
    }

}
