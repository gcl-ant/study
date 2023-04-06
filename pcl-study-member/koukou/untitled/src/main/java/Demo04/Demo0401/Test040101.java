package Demo04.Demo0401;

public class Test040101 {
    public static void main(String[] args) {
//    自行编写程序，验证try/catch/finally的用法，验证数学异常、空指针异常、数字格式异常、索引越界异常、类型转换异常。
//    考点：常见运行期异常，异常处理
        //数学异常 ArithmeticException
        System.out.println(10/0);
        System.out.println(10./0);//浮點部會發生異常
        //空指针异常 NullPointerException
        String s1 = null;
        System.out.println(s1.length());
        //数字格式异常 NumberFormatException
        String s2 = "abc";
        System.out.println(Integer.parseInt(s2));
        //索引越界异常 IndexOutOfBoundsException
        int[] a = new int [3];
        System.out.println(s2.charAt(3));
        System.out.println(a[3]);
        //类型转换异常 ClassCastException
        Object o = new Object();
        String s3 = (String)o;
    }
}
