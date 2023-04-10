package Demo04.Demo0406;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String str = "abc1efg";
        //abcdefg abc abcdefg
        //abcdefg bc abcdefg  黄
        System.out.println(str.substring(0));
        System.out.println(str.substring(1, 3));
        System.out.println(str.indexOf("c"));
        System.out.println(str.indexOf(3));

        String s = "beijingETC";
//返回字符串s中第一次出现i的位置索引，为2
        System.out.println(s.indexOf('i'));
//返回字符串s中最后一次出现i的位置索引，为4
        System.out.println(s.lastIndexOf('i'));
//返回字符串s中第3个字符以后，第一次出现字符i的位置索引，为4
        System.out.println(s.indexOf('i', 3));
//返回字符串中第一次出现jing的索引位置，为3
        System.out.println(s.indexOf("jing"));
//返回字符串中，第4个字符后，第一次出现jing的位置索引，由于没有，所以返回-1
        System.out.println(s.indexOf("jing", 4));
//返回字符串中的第二个字符，为i，注意索引从0开始
        System.out.println(s.charAt(2));

        int i = 10;
//将i转换为String类型
        String si = String.valueOf(i);

        char[] c1 = {'h', 'e', 'l', 'l', 'o'};
//将char数组转换为String类型
        String sc1 = String.valueOf(c1);

// 将char数组中的第1到第4个字符转换为String类型
        String sc2 = String.valueOf(c1, 1, 4);

//分别输出hello及ello

        List strlist = new ArrayList();
        System.out.println(sc1);
        System.out.println(sc2);
        System.out.println(c1.length);
        System.out.println(str.length());
        System.out.println("++" + strlist.size());

        //定义一个匹配手机号码的正则表达式
        String regex = "^((13[0-9])|(15[^4])|(18[0,2,3,5-9])|(17[0-8])|(147))\\d{8}$";
        //将正则表达式编译成Pattern对象
        Pattern pattern = Pattern.compile(regex);
        //定义多个手机号码，用来匹配
        String[] phoneNumbers = {"13561172191", "15498013822", "1809921212", "1792121144", "14723569087"};
        //使用增强for循环迭代数组
        for (String x : phoneNumbers) {
            //使用Pattern对象，为每一个手机号码生成匹配器
            Matcher matcher = pattern.matcher(x);
            //使用匹配器的matches方法进行匹配，返回true表示匹配成功，格式正确；否则表示格式不正确
            boolean flag = matcher.matches();
            if (flag) {
                System.out.println(x + " 是正确的手机号码；");
            } else {
                System.out.println(x + " 不是正确的手机号码；");
            }
        }



        Student s1 = new Student("xiaowangba ", 29);
        Student s2 = new Student("laowangba ", 31);

        //内部比较器的方法
//        System.out.println(s1.compareTo(s2));

        //外部比较器的调用方法
        Comparator<Student> studentComparator = new StudentComparator();
        System.out.println(studentComparator.compare(s1, s2));


        Student[] students = new Student[]{s1,s2};

        Arrays.sort(students);
        Arrays.sort(students,studentComparator);

    }
}
