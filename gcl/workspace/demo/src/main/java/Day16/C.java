package Day16;

public class C extends A1 implements IA{

    @Override
    public void print() {

    }

    @Override
    public void print1() {
        IA.super.print1();
    }

}
