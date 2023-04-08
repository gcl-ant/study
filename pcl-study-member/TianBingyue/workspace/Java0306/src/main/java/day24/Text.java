//package day24;
//
public class Text {
////    public static void main(String[] args) {
////        String s="suibianba";
//////返回字符串s中第一次出现i的位置索引，为2
////        System.out.println(s.indexOf('i'));
////        System.out.println(s.indexOf('i',3));
////        System.out.println(s.indexOf('s'));
////        System.out.println(s.lastIndexOf('b'));
////        System.out.println(s.lastIndexOf('i',3));
////        System.out.println(s.lastIndexOf(s));
////        System.out.println(s.indexOf("sui"));
////        System.out.println(s.indexOf("bian",4));
////        System.out.println(s.charAt(2));
////    }
//
//    public static void main(String[] args) {
//        double d = 1100.00;
//        boolean b = true;
//        long l = 1234567890;
//
//
//        char[] c1={'h','e','l','l','o'};
//        String sc1=String.valueOf(c1);
//        String sc2=String.valueOf(c1,1,4);
//
//        System.out.println("返回值 : " + String.valueOf(d) );
//        System.out.println("返回值 : " + String.valueOf(b) );
//        System.out.println("返回值 : " + String.valueOf(l) );
//        System.out.println("返回值 : " + String.valueOf(c1) );
//    }
//    }
public static void main(String args[]) {
    String str1 = "Strings";
    String str2 = "Strings";
    String str3 = "Strings123";

    int result = str1.compareTo( str2 );
    System.out.println(result);

    result = str2.compareTo( str3 );
    System.out.println(result);

    result = str3.compareTo( str1 );
    System.out.println(result);
}

}
