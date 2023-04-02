package org.example;

public class Day1daoDay5复习总结 {
    public static void main(String[] args) {


    //1. public(公共)类的命名 public修饰的类所在源文件命名：.java文件的名字必须与源文件中的class名字完全一致
    //   最多只能有一个public类,也可以没有public类；
    //2. main方法(java类必须有main方法)的声明规范  public static void main(String[] args)  { }, 参数名称args可以修改
    //3. Debug 调试  设置断点，断点指的是希望程序运行到此处暂停。
    //   IntelliJ IDEA快捷键
    //   alt+F9（恢复执行，表示接着执行代码，直接跳到下一个断点）
    //4. Java语法基本  表达式 字面量 常量 变量
    //   字符'' ; 字符串 ""
    //   关键字都是小写字母，不能用来命名，也称为保留字
    //   例：类  关键字 enum、interface、class、extends、implements
    //   对象 关键字 new、instanceof、this、super

    //变量是可变的，使用前需要先定义，称为声明变量
     int x=100;
     x=1000;
     System.out.println(x);
    // ！！ final修饰，将成为常量，不能被修改
    // final int x1=100;
    // x1=1000; //报错 Cannot assign a value to final variable 'x1'
    // System.out.println(x1);

    //一,数据类型（1.基本数据类型； 2.引用类型：除了8个基本数据类型之外的）

     // 1.1 基本数据类型 8种  (默认值)
        //数值型 byte（0）；short；int；long； float（注意！！0.0）；double（0.0）
        //整数 默认是int类型； 小数默认是double类型，声明单精度需要 a+F； 或者强制转换 float a = (float) a;
        //字符型 char（‘’ 空字符）   注意 空字符 和 null区别：
          //null 空引用，表示一个对象的值，没有分配内存；  空字符串，长度为0，占内存，在内存中分配一个空间
          //调用null的字符串的方法会抛出空指针异常 NullPointerException ===异常处理 Day20
        //布尔 boolean（false）
        String str1 = "";
        String str2=null;
        String a=new String();
        System.out.println(str1.equals(a));//ture
        System.out.println(str1==a);  //false

        // 1.1.1 基本数据类型 数据转换
        byte b=1;
        int  i=5;
        i=b;
        System.out.println("i="+i);
        //  范围小可以直接转换为表示范围大的类型

        byte b1=1;
        int i1=-2;
        b1=(byte)i1;
        // 表示范围大的不可以直接转换为转换范围小的类型,需要强制转换，称为显式转换

        //1.1.2 基本数据类型的赋值和比较运算  ==、！=、>、<、>=、<=
        //int i1=1;
        //int i2=2;
        //System.out.println("i1==i2 "+(i1==i2));

     // 1.2 引用类型  基本数据类型的字母小写，引用类型的首字母大写
        //除了String、包装器类（共8个）外，都需要使用new 关键字；
        //String  Integer（和它类似的还有7个包装器类）比较特殊是可以不使用new直接赋值，例如 String s=“hello”;
        //Integer i=10;

     // 1.3  引用类型的赋值和比较运算
        //引用类型只能用 == 以及 != 进行比较;比较的是地址，内容用equals
        //引用类型的其他操作需要调用方法；例如，String类中的compareTo方法: 1- 字符串与对象进行比较;2- 按字典顺序比较两个字符串。
          //int compareTo(Object o)  比较字符串的长度差值
          //int compareTo(String anotherString)
          //参数 o --- 比较的对象;  anotherString -- 要比较的字符串;

     // 2.1  包装器类型
        //8个  特殊 int----Integer；char----Character
        //PPT2  P40
        //自动装箱，拆箱    装箱：基本数据类型转换为包装器类型； 拆箱：包装器类型转换为基本数据类型
        //自动装箱
        int a1=127;
        Integer ao1=new Integer(a1);
        int b2=ao1.intValue();
        //自动装箱
        Integer ao2=a1;
        Integer ao3=127;
        //自动拆箱
        int b3=ao2;
        int b4=ao2+ao3;
       //!! 使用new创建赋值，指向堆中不同的空间;  常量池概念
        Integer i3=300;
        Integer i4=300;
        Integer io3=new Integer(300);
        Integer io4=new Integer(300);
        System.out.println("i3==i4"+(i3==i4)); //false
        System.out.println("io3==io4"+(io3==io4));  //false
       // !! 在自动装箱拆箱过程中，只有数值是数据类型 范围内的时候，才使用到常量池，否则都是分配新的内存空间；

     //二，数组
       //2.1 一维数组的声明形式
         // 数组元素类型[ ] 变量名称;  int[] a; 或 String[] s;
         // 数组元素类型    变量名称[ ] ; int a[]; 或String s[]；
       //2.2 一维数组的初始化 3种方式
        //第一种：数组元素类型[ ] 变量名称=new 数组元素类型[数组长度];  int[] a1=new int[5]; int[0]=1  赋值
        //第二种：数组元素类型[ ] 变量名称=new 数组元素类型[]{用逗号隔开元素的具体值}; int[] a2=new int[]{1,2,3};
        //第三种：数组元素类型[ ] 变量名称= {用逗号隔开元素的具体值}; int[] a3={4,5,6};
        //！！ 返回 数组的长度   数组变量名+ .length

       //2.3 数组的遍历 for循环 和 增强for循环（更常用）  PPT2 P67
        int[] a5=new int[]{1,2,10};
        //使用for循环遍历
        for(int i2=0;i2<a5.length;i2+=2){
            System.out.println(a5[i2]);
        }
        //使用增强for循环遍历
        for(int x1:a5){
            System.out.println(x);

       //2.4 二维数组的声明创建
          //数组元素类型[ ][ ] 变量名称=new 数组元素类型[一维长度] [二维长度];


        }









    }
}