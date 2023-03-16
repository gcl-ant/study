package Demo03.Demo0311;

public class Homework0311 {
    public  static  void  main(String[]args) {
        //        作业1：
        //        题目：编写代码验证String的特性：直接用=赋值，相同内容的字符串实际是一个对象；用new赋值，每次都创建一个新的对象。
        //        考核点：字符串类，==作用
        //        难度：中
        //        作业2：
        //        题目：编写代码，验证自动装箱/拆箱的概念。
        //        考点：自动装箱/拆箱
        //        难度：低
        //        作业3：编写代码，声明一个int型数组，长度为3，使用三种方式为数组元素赋值为{1,2,3}；
        //        声明一个int型二维数组，一维和二维的长度分别是2和3，并分别进行赋值，具体值自行确定；
        //        考点：数组的声明与创建
        //        难度：低
        System.out.println("作業1");
        String str1 = "1";
        String str2 = new String("1");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println("作業2");
        Integer a1 = 1;
        Integer a2 = 2;
        int b1 = a1+a2;
        int b2 = a1-a2;
        System.out.println(b1+b2);
        System.out.println("作業3-1");
        int[] i1 = {1,2,3};
        int[][] i2 = new int[2][3];
        i2[0][0] = 1;
        i2[0][1] = 2;
        i2[1][0] = 3;
        i2[1][1] = 4;
        i2[1][2] = 5;
        for (int[] x:i2){
            for(int y:x)
                System.out.println(y);
        }
        System.out.println("作業3-2");
        int[][] i3 = {{1,2},{3,4,5}};
        for (int[] n:i3){
            for(int m:n)
            System.out.println(m);
        }
    }
}
