package day04;
public class homework {
        public static void main(String[] args) {
            // 使用java定义一个字符串数组，长度为10 ，内容为 a,b,c,ddddddd,e,f,ggggg
            String[] arr1 = new String[10];
            arr1[0] ="a";
            arr1[1] ="b";
            arr1[2] ="c";
            arr1[3] ="ddddddd";
            arr1[4] ="e";
            arr1[5] ="f";
            arr1[6] ="ggggg";
            // 分别打印出他的每个项的值  0-9
                System.out.println("分别打印出他的每个项的值  0-9");
            for (int i = 0; i < arr1.length; i++) {
                System.out.println( arr1[i]);
            }

            // 把第2项[c] 和第5项的值拼接出来，并且放到一个新的字符串数组中
            String[] arr2 = new String[3];
            arr2[0] = arr1[2] + arr1[5];
            // 把第2项[c] 和第6项的值拼接出来，放到上面一步的数组中
            arr2[1] = arr1[2] + arr1[6];
            // 把第2项[c] 和第7项的值拼接出来，放到上面一步的数组中
            arr2[2] = arr1[2] + arr1[7];

            // 使用基础FOR循环打印出新生成的数组
                System.out.println("使用基础FOR循环打印出新生成的数组");
            for (int i = 0; i < arr2.length; i++) {
                System.out.println( arr2[i]);
            }

            // 使用增强For循环打印出新生成数组的每个元素的长度  xxxx.length()
                System.out.println("使用增强For循环打印出新生成数组的每个元素的长度");
            for (String s : arr2) {
                System.out.println( s.length());
            }
        }

}