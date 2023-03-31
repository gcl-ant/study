package Demo03.Demo0327;

public class Test0327 {
    public static void main(String[] args) {
        //向上转型
        InterfaceTest1 implementTest3 = new InterfaceTest3();
        //普通指向
//        ImplementTest3 implementTest3 = new ImplementTest3();

        implementTest3.print(" Hello interface");
        implementTest3.printDefault();

        IA ia = new IIB2();
        ia.print();
        ia.print1();
    }
}