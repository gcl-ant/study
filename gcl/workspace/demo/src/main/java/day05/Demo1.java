package day05;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class Demo1 {
    public static void main(String[] args) {

        Integer[] intArr = {55, 11, 33, 44, 66, 22};

        //元素排序
        Arrays.sort(intArr);

        System.out.println("------------元素排序");
        for (Integer item : intArr) {
            System.out.println(item);
        }

        System.out.println("元素排序,降序");

        Arrays.sort(intArr, Collections.reverseOrder());

        for (Integer item : intArr) {
            System.out.println(item);
        }

        //第一种：数组元素类型[ ] 变量名称=new 数组元素类型[数组长度];
        //
        //第二种：数组元素类型[ ] 变量名称=new 数组元素类型[]{用逗号隔开元素的具体值};
        //
        //第三种：数组元素类型[ ] 变量名称= {用逗号隔开元素的具体值};
        int[] intArr1 = new int[2];
        // intArr1[0]  0
        // intArr1[1]  0

        int[] intArr2 = new int[]{3, 4, 5};

        int[] intArr3 = {1, 2};

        //++ --
        System.out.println("------------++运算符");
        int a = 0;
        int b = 0;
        for (int item : intArr3) {
//            System.out.println(item);
//            System.out.println("++前" + a);
//            a++;

//            System.out.println("++后" + a);
        }

        //
        //a++   a+=1  a = a+1
        int out = intArr2[a++];// ++灾后  先用原来的值进行运算在对a进行+1
        int out2 = intArr2[++b];// ++在前  先对b进行+1，在进行运算
        System.out.println("a++" + out);
        System.out.println("++b" + out2);


        int a1 = 13;
        int b1 = 5;
        System.out.println("a1/b1=" + (a1 / b1));
        System.out.println("a1%b1=" + (a1 % b1));

        System.out.println("&" + (Boolean.TRUE & Boolean.TRUE));//TRUE
        System.out.println("&" + (Boolean.TRUE & Boolean.FALSE));//FALSE
        System.out.println("&" + (Boolean.FALSE & Boolean.FALSE));//FALSE

        System.out.println("|" + (Boolean.TRUE | Boolean.TRUE));//TRUE
        System.out.println("|" + (Boolean.TRUE | Boolean.FALSE));//TRUE
        System.out.println("|" + (Boolean.FALSE | Boolean.FALSE));//FALSE

        System.out.println("!|" + !(Boolean.TRUE | Boolean.TRUE));//FALSE
        System.out.println("!|" + !(Boolean.TRUE | Boolean.FALSE));//FALSE
        System.out.println("!|" + !(Boolean.FALSE | Boolean.FALSE));//TRUE

        String str1 = "aaa";
        String str2 = null;
        System.out.println("!|" + (str1.length() == 1 & true));//TRUE
        System.out.println("&&" + (!Objects.isNull(str2) && str2.length() == 1));//TRUE
//        System.out.println("!|" + (!Objects.isNull(str2) & str2.length() == 1));//TRUE


        System.out.println("||" + (true || str2.length() == 1));//TRUE
//        System.out.println("|" + (true | str2.length() == 1));//TRUE


        //作业4：编写代码，声明一个int型数组，长度为3，使用三种方式为数组元素赋值为{1,2,3}；声明一个int型二维数组，一维和二维的长度分别是2和3，并分别进行赋值，具体值自行确定；
        //考点：数组的声明与创建
        //难度：低
        //二维数组怎么打印
        int[] arr111 = new int[3];
        arr111[0] = 1;
        arr111[1] = 2;
        arr111[2] = 3;

        int[] arr112 = new int[] {1,2,3};

        int[] arr113 = {1,2,3};

        int[][] arr2 = {{12, 13, 14}, {22, 23, 24}};
        for (int[] itemOut : arr2) {
            for (int item : itemOut) {
                System.out.println(item);
            }
        }

        //作业1：
        //题目：编写代码验证String的特性：直接用=赋值，相同内容的字符串实际是一个对象；用new赋值，每次都创建一个新的对象。
        //考核点：字符串类，==作用
        //难度：中
        String str11 = "aaa";
        String str12 = new String("aaa");
        System.out.println(str11 == str12);
        System.out.println(str11.equals(str12));

        //作业3：
        //题目：编写代码，验证自动装箱/拆箱的概念。
        //考点：自动装箱/拆箱
        //难度：低
        int i11111= 1;
        Integer i111 = i11111;
        int i2222 = i111;

    }
}
