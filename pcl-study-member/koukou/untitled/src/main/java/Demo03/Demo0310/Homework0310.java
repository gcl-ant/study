package Demo03.Demo0310;

public class Homework0310 {
    public static void main(String[] args) {
        //定义一个字符串数组，长度为10 ，内容为 a,b,c,ddddddd,e,f,ggggg
        System.out.println("定义一个字符串数组，长度为10 ，内容为 a,b,c,ddddddd,e,f,ggggg");
        String[] hw = {"a", "b", "c", "ddddddd", "e", "f", "ggggg", "", "", ""};
        //分别打印出他的每个项的值  0-9
        System.out.println("字符串的第一個值為：" + hw[0]);
        System.out.println("字符串的第二個值為：" + hw[1]);
        System.out.println("字符串的第三個值為：" + hw[2]);
        System.out.println("字符串的第四個值為：" + hw[3]);
        System.out.println("字符串的第五個值為：" + hw[4]);
        System.out.println("字符串的第六個值為：" + hw[5]);
        System.out.println("字符串的第七個值為：" + hw[6]);
        System.out.println("字符串的第八個值為：" + hw[7]);
        System.out.println("字符串的第九個值為：" + hw[8]);
        System.out.println("字符串的第十個值為：" + hw[9]);
        System.out.println("--------------------");
        //把第2项[c] 和第5项的值拼接出来，并且放到一个新的字符串数组中
        //把第2项[c] 和第6项的值拼接出来，放到上面一步的数组中
        //把第2项[c] 和第7项的值拼接出来，放到上面一步的数组中
        System.out.println("把第2项[c] 和第5项的值拼接出来，并且放到一个新的字符串数组中");
        System.out.println("把第2项[c] 和第6项的值拼接出来，放到上面一步的数组中");
        System.out.println("把第2项[c] 和第7项的值拼接出来，放到上面一步的数组中");
        String[] hwn = {hw[2] + hw[5], hw[2] + hw[6], hw[2] + hw[7]};
        System.out.println("拼接後的第一個字符:" + hwn[0]);
        System.out.println("拼接後的第二個字符:" + hwn[1]);
        System.out.println("拼接後的第三個字符:" + hwn[2]);
        //使用基础FOR循环打印出新生成的数组
        System.out.println("--------------------");
        System.out.println("使用基础FOR循环打印出新生成的数组");
        for (int i = 0; i < hwn.length; i++) {
            System.out.println("第" + i + "項字符,值為:" + hwn[i]);
        }
        //使用增强For循环打印出新生成数组的每个元素的长度  xxxx.length()
        System.out.println("--------------------");
        System.out.println("使用增强For循环打印出新生成数组的每个元素的长度  xxxx.length()");
        for (String x : hwn) {
            System.out.println("對應的值的長度為:" + x.length());
        }
    }
}