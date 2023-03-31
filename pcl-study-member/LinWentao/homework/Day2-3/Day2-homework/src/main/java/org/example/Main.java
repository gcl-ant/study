package org.example;

public class Main {
    public static void main(String[] args) {
        //基本数据类型
        byte  a = 2;
        System.out.println(a);
        short b = 88;
        System.out.println(b);
        int   c = 666;
        System.out.println(c);
        long  d = 6688;
        System.out.println(d);
        //单精度  次方 Math.pow(a,b);   默认是double类型，声明单精度需要 a+F； 或者强制转换 float a = (float) a;
        float e = 3.455F;
        System.out.println(e);

        double f =Math.pow(2.5589,3);
        System.out.println(f);

        double g =3.4;
        System.out.println(g);

        char   j = '5';
        System.out.println(j);

        boolean k = true;
        System.out.println(k);

        boolean l = false;
        System.out.println(l);
        System.out.println("================");

        // 基本类型 包装类型
        Byte b1= new Byte("1");
        Short b2=new Short("2");
        // int 包装类型 Integer
        Integer b3=new Integer("3");
        Long b4=new Long("33");
        Float b5=new Float("0.11");
        Double b6=new Double("0.21");
        Boolean b7=new Boolean(true);
        Character b8= new Character('5');

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        System.out.println(b6);
        System.out.println(b7);
        System.out.println(b8);
        System.out.println("================");
        // 基本数据类型 比较 引用类型
        double d1=1.0;
        float d2=1.0f;
        System.out.println("d1=d2 "+ (d1==d2));
        System.out.println("d1!=d2 "+ (d1!=d2));

        short d3 = 5;
        int d4 = 6;
        System.out.println("d3<d4"+(d3<d4));

        short c1 = 87;
        long c2 = 88;
        System.out.println("c1+1!=c2"+(c1+1!=c2));
        System.out.println("================");

        //包装类型比较 引用类型
        //Byte b1= new Byte("1");
        //            Short b2=new Short("2");
        //            Integer b3=new Integer("3");
        //            Long b4=new Long("33");
        //            Float b5=new Float("0.11");
        //            Double b6=new Double("0.21");
        //            Boolean b7=new Boolean(true);
        //            Character b8= new Character('5');
        System.out.println(b1>=b3);
        System.out.println(b1.equals(b5));







    }
}