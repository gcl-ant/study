package day0405;

public class day0405 {
    public static void main(String[] args) {

/*作业1：
题目：编写代码验证String的特性：直接用=赋值，相同内容的字符串实际是一个对象；用new赋值，每次都创建一个新的对象。
考核点：字符串类，==作用
难度：中*/

        String str1="Doge";
        String str2=new String("Doge");

        System.out.println("str1==str2"+(str1==str2));
        System.out.println("str1==str2"+(str1.equals(str2)));

/*作业2：
 题目：编写代码验证String和StringBuffer的区别：String对象不能被改变，StringBuffer对象可以被改变。
考核点：String与StringBuffer的区别
难度：中*/
        StringBuffer sbf1=new StringBuffer ("Doge");
        StringBuffer sbf2=new StringBuffer (" Cheems");
        sbf1.append(sbf2);
        System.out.println(sbf1);

        String str01="Doge";
        String str02=" Cheems";
        String str03=str01+str02;
        System.out.println(str03);


/*作业3：
题目：编写代码，验证自动装箱/拆箱的概念。
考点：自动装箱/拆箱
难度：低*/
        int i1=1;
        Integer i2=2;
        int i3=i2;
        System.out.println("i3="+i3);

/*作业4：编写代码，声明一个int型数组，长度为3，使用三种方式为数组元素赋值为{1,2,3}；声明一个int型二维数组，一维和二维的长度分别是2和3，并分别进行赋值，具体值自行确定；
考点：数组的声明与创建
难度：低*/

        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;

        int[] arr2 = new int[] {1,2,3};

        int[][] arr3 = {{12,13,14},{22,23,24}};
        for (int[] itemOut : arr3) {
            for (int item : itemOut) {
                System.out.println(item);
            }
        }

/*作业2
        //定义一个字符串数组，长度为10 ，内容为 a,b,c,ddddddd,e,f,ggggg
        //分别打印出他的每个项的值  0-9
        //把第2项[c] 和第5项的值拼接出来，并且放到一个新的字符串数组中
        //把第2项[c] 和第6项的值拼接出来，放到上面一步的数组中
        //把第2项[c] 和第7项的值拼接出来，放到上面一步的数组中
        //使用基础FOR循环打印出新生成的数组
        //使用增强For循环打印出新生成数组的每个元素的长度  xxxx.length()*/

        String[] str04 = new String[10]{"a","b","c","ddddddd","e","f","ggggg"};

        for(int i = 0; i<str04.length; i++)
        System.out.println(str04[i]);



    }
}
