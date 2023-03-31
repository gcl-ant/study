package Day16;

public class TestIAB implements IB1,IB2{
//    @Override
    public void m() {
        IB1.super.m();
        IB2.super.m();
    }

    @Override
    public void print() {

    }

    @Override
    public void print1() {
        IB1.super.print1();
    }
}
