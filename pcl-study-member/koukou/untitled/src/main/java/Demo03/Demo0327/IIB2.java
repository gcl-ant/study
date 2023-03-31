package Demo03.Demo0327;

public class IIB2 extends IIA implements IB1,IB2{
    @Override
    public void print() {
        System.out.println("B1 a");
    }
    @Override
    public void print1() {
        IB1.super.print1();
        IB2.super.print1();
    }
}
