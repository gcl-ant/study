package day23;

public class Test {
    public static void main(String[] args) {
            int i=10;
            char[] c1={'h','e','l','l','o'};
            char c=1;
            boolean b = true;
            double d=1.0;


//将i转换为String类型
            String si=String.valueOf(i);
            String sb=String.valueOf(b);


//将char数组转换为String类型
            String sc1=String.valueOf(c1);

// 将char数组中的第1到第4个字符转换为String类型
            String sc2=String.valueOf(c1,1,4);

//分别输出hello及ello
            System.out.println(sc1);
            System.out.println(sc2);
        }



}