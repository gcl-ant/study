public class Day4homework {
    public static void main(String[] args) {
        //作业1，2
        // 建立新的字符串数组 长度为10   打印
        String[] a1= {"a","b","c","dddddd","e","f","ggggg","h8","i9","j10"};
        System.out.println(a1[0]);
        System.out.println(a1[1]);
        System.out.println(a1[2]);
        System.out.println(a1[3]);
        System.out.println(a1[4]);
        System.out.println(a1[5]);
        System.out.println(a1[6]);
        System.out.println(a1[7]);
        System.out.println(a1[8]);
        System.out.println(a1[9]);

        // 用for循环打印 a1
        for(String i: a1){
            System.out.print(i);
        }
        //output: abcdddddddefgggggh8i9j10

        //作业3，4，5
        //把第二项和第5项 第二项和第6项 第二项和第7项拼接 放入新数组
        String[] a2=new String[]{a1[2]+a1[5],a1[2]+a1[6],a1[2]+a1[7]};

        //作业6
        //用基础for循环打印 新数组

        System.out.println("\n基础for循环打印新数组");
        for (int i=0; i<a2.length;i++){
            System.out.println(a2[i]);
        }

        //作业7
        //用增强for循环打印新数组每项的长度
        //for(数据类型 变量名 :遍历的目标){};
        //数据类型 变量名:声明一个变量用来接收遍历目标遍历后的元素
        // 普通for循环可以没有遍历的目标，而增强for循环一定要有遍历的目标

        for (String b:a2){
            System.out.println("长度"+i + b.length());
        }
    }


    }

