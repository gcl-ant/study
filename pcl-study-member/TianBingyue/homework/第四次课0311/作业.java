package org.example;

public class study0311 {public static void main(String[] args) {

//homework1
    String str1 = "666";
    String str2 = String.valueOf(999);
    String s1 = new String("6699");

    System.out.println(str1 == s1);
    System.out.println(str1.equals(s1));
//homework2.
// 2.1.按要求定义一个字符串
    String[] a = {"a", "b", "c", "dddd", "e", "f", "ggggggg", "hh", "iii", "j"};
// 2.2.分别打印出每个项的值
    System.out.println(a[0]);
    System.out.println(a[1]);
    System.out.println(a[2]);
    System.out.println(a[3]);
    System.out.println(a[4]);
    System.out.println(a[5]);
    System.out.println(a[6]);
    System.out.println(a[7]);
    System.out.println(a[8]);
    System.out.println(a[9]);
// 2.3.把第2项和第5项的值拼接出来，放到一个新的字符串数组中
    String[] aa= new String[]{a[2] + a[5]};
//    StringBuffer aa = new StringBuffer(a[2]);
//    StringBuffer aa2 = new StringBuffer(a[5]);
//    aa.append(aa2);
//    System.out.println(aa);
//    String[] s = {"aa"};
//    System.out.println(s);
//// 2.4.把第2项和第6项的值拼接出来，放到上面一步的数组中
//    String[][] aaa = {{"a[2]" + "a[5]"}, {"a[2]" + "a[6]"}};
//    System.out.println(aaa);
// 2.5.把第2项和第7项的值拼接出来，放到上面一步的数组中
//    String[][] aab = {{"a[2]" + "a[5]"}, {"a[2]" + "a[6]"}, {"a[2]" + "a[7]"}};

// 2.6.使用基础FOR循环打印出新生成的数组
    for (int i = 0; i < aa.length; i++) {
        System.out.println(aa[i]);
    }
// 2.7.使用增强FOR循环打印出新生成的数组的每个元素的长度 xxxx.length()
//    for (String[] item : aab) {
//        System.out.println(item);
//}


//homework3
        int i = 1;
        Integer i1 = i;
        int i2 = i1;
//homework4.按要求声明一个int型数组，用3中方式为数组元素赋值；声明一个int二维数组（长度：一维2，二维3）并分别赋值
        int[] a1 = new int[3];
        a1[0] = 1;
        a1[1] = 2;
        a1[2] = 3;

        int[] a2 = new int[]{1, 2, 3};
        int[] a3 = {1, 2, 3};
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        int[][] arr2 = {{12, 13, 14}, {22, 23, 24}};
        for (int[] itemOut : arr2) {
            for (int item2 : itemOut) {
                System.out.println(item2);
            }
        }
    }
}
}