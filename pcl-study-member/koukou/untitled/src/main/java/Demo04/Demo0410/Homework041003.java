package Demo04.Demo0410;

public class Homework041003 {
    //题目：编写截取字符串的方法，输入为一个字符串和字节数，输出为按字节截取的字符串。具体要求：确保汉字不被截取半个，
    //如“我ABC”,4，应该截为 我AB；输入 我ABC汉语DEF,6  输出 我ABC，而不是汉的半个字；输入 我ABC汉语DEF,7，输出 我ABC汉。
    public static void main(String[] args) {
        String str1 = "我ABC";
        String str2 = "我ABC你我DEF";
        Strlength strlength = new Strlength();
        System.out.println(strlength.strlength(str1,5));
        System.out.println(strlength.strlength(str2,6));
        System.out.println(strlength.strlength(str2,9));
    }
}
class Strlength{
    String strlength(String str,int len) {
        byte[] by = str.getBytes();
        str = new String(by, 0, len);
        return str;
    }
}