package Demo03.Demo0309;

public class Text0309 {
    static String s;
    public  static  void  main(String[]args){
//        System.out.println(s);

        String str1 = null;
        String str2 = "";

        System.out.println(str1);
        System.out.println(str2);

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));

//        int i01 = 10;
//        Integer i02 = new Integer(i01);
//        i01 = i02.intValue();
//
//        double d=i02.doubleValue();
//
//        System.out.println(i01);

        //傳統裝箱，拆箱
        int a=128;
        Integer a01=new Integer(a);
        int b1=a01.intValue();
        //自動裝箱
        Integer a02=a;
        Integer a03=128;
        //自動拆箱
        int b2=a02;
        int b3=a02+a03;
        System.out.println(b3);
    }
}