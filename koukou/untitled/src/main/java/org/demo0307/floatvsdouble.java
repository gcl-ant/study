package org.demo0307;

public class floatvsdouble {
    public static void main(String[] args) {

        float f1 = 5f;
        float f2 = 0.2f;
        float f3 = 0.3f;
        float f4 = 0.4f;
        float f5 = 0.53125f;
        double d1 = 5d;
        double d2 = 0.2d;
        double d3 = 0.3d;
        double d4 = 0.4d;
        double d5 = 0.53125d;

        //0.5,0.25,0.125,0.0625,0.03125

        System.out.println(f1 == d1);
        System.out.println(f2 == d2);
        System.out.println(f3 == d3);
        System.out.println(f4 == d4);
        System.out.println(f5 == d5);

        double d6=0.3d;
        float f6=0.3f;
        System.out.println("d3==d4 "+(d6==f6));//FALSE
        System.out.println("d3!=d4 "+(d6!=f6));//TRUE
        System.out.println("d3>d4 "+(d6>f6));//FALSE
        System.out.println("d3<d4 "+(d6<f5));//TRUE

    }
}
