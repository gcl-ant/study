package Demo04.Demo0406;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test040602 {
    public static void main(String[] args) {
        //String str = "abc";
        //等同于：
        char data[] = {'a', 'b', 'c'};
        String str = new String(data);
        String str1 = "abcdefg";
        //substring
        System.out.println("-----substring-----");
        System.out.println(str1.substring(1));
        System.out.println(str1.substring(1,5));
        //index
        System.out.println("-----index-----");
        System.out.println(str1.indexOf('d'));
        System.out.println(str1.indexOf('d',2));
        System.out.println(str1.indexOf("d"));
        System.out.println(str1.indexOf("d",2));
        //lastindex
        System.out.println("-----lastindex-----");
        System.out.println(str1.lastIndexOf('d'));
        System.out.println(str1.lastIndexOf('d',6));
        System.out.println(str1.lastIndexOf("d"));
        System.out.println(str1.lastIndexOf("d",6));
        //charAt
        System.out.println("-----charAt-----");
        System.out.println(str1.charAt(0));
        //valueOf
        System.out.println("-----valueOf-----");
        boolean b = true;
        String strb = String.valueOf(b);
        System.out.println(strb);
        char c = 'A';
        String strc = String.valueOf(c);
        System.out.println(strc);
        char[] ch1 = {'a','b','c'};
        String strch1 = new String(ch1);
        System.out.println(strch1);
        char[] ch2 = {'a','b','c'};
        String strch2 = new String(String.valueOf(ch2,1,2));
        System.out.println(strch2);
        double d = 1.0d;
        String strd = String.valueOf(d);
        System.out.println(strd);
        float f = 1.0f;
        String strf = String.valueOf(f);
        System.out.println(strf);
        int i = 1;
        String stri = String.valueOf(i);
        System.out.println(stri);
        long l = 1;
        String strl = String.valueOf(l);
        System.out.println(strl);
//        static String valueOf(Object obj)
//        将引用类型参数以字符串类型返回，实际调用toString方法
        //compareTo
        System.out.println("-----compareTo-----");
        String str2 = "321";
        String str3 = "123";
        int compareTo = str2.compareTo(str3);
        System.out.println(compareTo);
//        int compareTo(String anotherString)
//        比较两个字符串的字典顺序，返回值为正数，表示大于
        //With
        System.out.println("-----With-----");
        boolean starts1 = str3.startsWith("3");
        boolean starts2 = str3.startsWith("3",0);
        boolean ends = str3.endsWith("3");
        System.out.println(starts1);
        System.out.println(starts2);
        System.out.println(ends);
//        boolean startsWith(String prefix)
//        判断字符串是否以prefix开头
//        boolean startsWith(String prefix, int toffset)
//        判断字符串中从toffset个字符开始后的子串中，是否以prefix开头
//        boolean endsWith(String suffix)
//        判断一个字符串是否以suffix结尾
        //getBytes
        System.out.println("-----getBytes-----");
        byte[] by = str3.getBytes();
        System.out.println(by);
//        byte[] getBytes()
//        将字符串转换为byte数组
//        byte[] getBytes(Charset charset)
//        将字符串用指定的编码格式转换为byte数组
        //length
        System.out.println("-----length-----");
        int len = str3.length();
        System.out.println(len);
//        int length()
//        返回字符串的长度
        //trim
        System.out.println("-----trim-----");
        String str4 = " a b c";
        System.out.println(str4.trim());
//        String trim()
//        将字符串的首位空格去掉
        //正則表達
        System.out.println("-----正則表達-----");
        //定义一个匹配手机号码的正则表达式
        String regex="^((13[0-9])|(15[^4])|(18[0,2,3,5-9])|(17[0-8])|(147))\\d{8}$";
        //将正则表达式编译成Pattern对象
        Pattern pattern = Pattern.compile(regex);
        //定义多个手机号码，用来匹配
        String[] phoneNumbers={"13561172191","15498013822","1809921212","1792121144","14723569087"};
        //使用增强for循环迭代数组
        for(String x:phoneNumbers){
        //使用Pattern对象，为每一个手机号码生成匹配器
            Matcher matcher=pattern.matcher(x);
        //使用匹配器的matches方法进行匹配，返回true表示匹配成功，格式正确；否则表示格式不正确
            boolean flag=matcher.matches();
            if(flag){
                System.out.println(x+" true");
            }else{
                System.out.println(x+" false");
            }
        }
    }
}