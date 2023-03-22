public class Mar10th {
    public static void main(String[] args) {

        //定义一个字符串数组，长度为10 ，内容为 a,b,c,ddddddd,e,f,ggggg
        String[] str = new String[10];
        str[0] = "a";
        str[1] = "b";
        str[2] = "c";
        str[3] = "ddddddd";
        str[4] = "e";
        str[5] = "f";
        str[6] = "ggggg";
        //分别打印出他的每个项的值  0-9
        System.out.println("每个项的值是");
        for(int i = 0; i < str.length; i++){
            System.out.print(str[i] + " ");
        }
        System.out.println();
        //把第2项[c] 和第5项的值拼接出来，并且放到一个新的字符串数组中
        //把第2项[c] 和第6项的值拼接出来，放到上面一步的数组中
        //把第2项[c] 和第7项的值拼接出来，放到上面一步的数组中
        String[] strNew = {str[2] + str[5], str[2] + str[6], str[2] + str[7]};
        //使用基础FOR循环打印出新生成的数组
        System.out.println("新生成的数组是");
        for (int i = 0; i < strNew.length; i++) {
            System.out.print(strNew[i] + " ");
        }
        System.out.println();
        //使用增强For循环打印出新生成数组的每个元素的长度  xxxx.length()
        System.out.println("每个元素的长度分别是");
        for (String element: strNew){
            System.out.print(element.length() + " ");
        }
    }
}
