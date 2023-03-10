package day2;

public class Demo03 {

    // 此处不考虑static含义，后续学习；只为了能在main方法中访问；
//    static String s;
    static String s = null;
    public static void main(String[] args) {
//        System.out.println(s);

        String str1 = null;
        String str2 = "";

        System.out.println(str1);
        System.out.println(str2);

        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str1));


//        Byte b = new Byte("130");

//        System.out.println(b);


        //传统的装箱、拆箱
        int a=128;
        Integer ao1=new Integer(a);
        int b1=ao1.intValue();
        //自动装箱
        Integer ao2=a;
        Integer ao3=128;
        //自动拆箱
        int b2=ao2;
        int b3=ao2+ao3;


        Integer i1=10;
        Integer i2=10;
        Integer io1=new Integer(10);
        Integer io2=new Integer(10);
        System.out.println("i1==i2"+(i1==i2));
        System.out.println("io1==io2"+(io1==io2));

        //插入 128  只有是可以转换成基本类型的包装类型才可以拆箱 常量
//        Character c1=new Character("134");
//        Character c2=new Character("134");
        Character c3=13;//char
        Character c4=13;//char
//        System.out.println("c1==c2"+(c1==c2)); //
        System.out.println("c3==c4"+(c3==c4)); //

        //PPT 46  -- 56

    }

}
