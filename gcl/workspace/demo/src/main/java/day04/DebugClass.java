package day04;

import day2.Test12;

import java.util.Arrays;

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


        int a, b, c, d;

        int[] a1 = {10, 45, 23};


        //final 最终类型  他的意思是，一旦进行赋值就无法变更
        final int x1 = 10;
//        x1=1000;//编译错误，final修饰x后即为常量，不能被修改
        System.out.println(x1);

//        StringBuffer stringBuffer1 = new StringBuffer("ST1");
//        StringBuilder stringBuilder1 = new StringBuilder("ST2");
//        String string1 = new String("ST1");

        //JDK 1.7
        StringBuffer sbf1 = new StringBuffer("Etc");
        StringBuffer sbf2 = new StringBuffer(" Java");
        sbf1.append(sbf2);
        System.out.println(sbf1);

        //1.8
        String str1 = "Etc";
        String str12 = " Java";
        String str3 = str1 + str12;
        System.out.println(str3);


        int[] aIntArr = {1, 2, 3};

        Integer[] aIntArr2 = {11, 22, 33};

        Integer[] aIntArr21 = {new Integer(1), new Integer(2), new Integer(3)};

        System.out.println("aIntArr2 第二个元素是:" + aIntArr2[1]);

        Integer[][] aIntArr22 = {{11}, {22}, {33, 44}};

        System.out.println("aIntArr22 第二个元素是:" + aIntArr22[1][0]);

        System.out.println("aIntArr32 第二个元素是:" + aIntArr22[2][1]);


        Integer[][][] aIntArr222 = {{{}}, {{}}, {{11, 22, 33}}};

        System.out.println("aIntArr222 第二个元素是:" + aIntArr222[2][0][1]);
        System.out.println("aIntArr222 的长度" + aIntArr222.length);
        // aIntArr222[2]     {{11,22,33}}
        System.out.println("aIntArr222 第二层最后一个数组的长度" + aIntArr222[2].length);

        // aIntArr222[2][0]     {11,22,33}
        System.out.println("aIntArr222 第二层最后一个数组的长度" + aIntArr222[2][0].length);

        // aIntArr222[2][0][2]     33  toString()   "33"   length()
        System.out.println("33 长度是" + aIntArr222[2][0][2].toString().length());


        // CTRL  + L
        System.out.println("普通FOR循环开始数组循环");
        // base for
        for (int i = 0; i < aIntArr2.length; i++) {
            System.out.println("当前数组的下标是:" + i + ",对应的数组里存储的元素是:" + aIntArr2[i]);
        }
        System.out.println("普通FOR循环结束数组循环");

        System.out.println("增强FOR循环开始数组循环");
        //增强for循环
        for (int item:aIntArr2){
            System.out.println("对应的数组里存储的元素是:" + item);
        }
        System.out.println("增强FOR循环结束数组循环");

        System.out.println("JDK8 循环开始数组循环");
        Arrays.stream(aIntArr2).forEach(System.out::println);
        System.out.println("LAMBDA");
        Arrays.stream(aIntArr2).forEach(item ->{System.out.println("对应的数组里存储的元素是:" + item);});
        System.out.println("JDK8 循环结束数组循环");

        //定义一个字符串数组，长度为10 ，内容为 a,b,c,ddddddd,e,f,ggggg
        //分别打印出他的每个项的值  0-9
        //把第2项[c] 和第5项的值拼接出来，并且放到一个新的字符串数组中
        //把第2项[c] 和第6项的值拼接出来，放到上面一步的数组中
        //把第2项[c] 和第7项的值拼接出来，放到上面一步的数组中
        //使用基础FOR循环打印出新生成的数组
        //使用增强For循环打印出新生成数组的每个元素的长度  xxxx.length()
    }
}
