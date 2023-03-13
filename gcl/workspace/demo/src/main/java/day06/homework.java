package day06;

public class homework {
    public static void main(String[] args) {
        //定义一个字符串数组，长度为10 ，内容为 a,b,c,ddddddd,e,f,ggggg
        //分别打印出他的每个项的值  0-9
        //把第2项[c] 和第5项的值拼接出来，并且放到一个新的字符串数组中
        //把第2项[c] 和第6项的值拼接出来，放到上面一步的数组中
        //把第2项[c] 和第7项的值拼接出来，放到上面一步的数组中
        //使用基础FOR循环打印出新生成的数组
        //使用增强For循环打印出新生成数组的每个元素的长度  xxxx.length()

        String[] strArr = new String[10];
        strArr[0] = "a";
        strArr[1] = "b";
        strArr[2] = "c";
        strArr[3] = "ddddddd";
        strArr[4] = "e";
        strArr[5] = "f";
        strArr[6] = "ggggg";

        int x = 1;
        for (String str :strArr){
            System.out.println("第" + x + "项的值是:" + str);
            x++;
        }

        String[] strArr1 = new String[]{strArr[2] + strArr[5],strArr[2] + strArr[6],strArr[2] + strArr[7]};

        for (int i =0 ;i<strArr1.length;i++){
            System.out.println("第" + (i+1) + "项的值是:" + strArr1[i]);
        }

        int j = 1;
        for (String str :strArr1){
            System.out.println("第" + j + "项的长度是:" + str.length());
            j++;
        }

    }
}
