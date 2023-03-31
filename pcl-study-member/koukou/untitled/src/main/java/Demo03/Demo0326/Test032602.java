package Demo03.Demo0326;

public class Test032602 implements InterfaceTest2{
    @Override
    public void print1() {
    }
    @Override
    public void print2() {
    }
    @Override
    public void print3() {
    }
    public static void main(String[] args) {
    }
}
interface InterfaceTest1 {
    public static final int age = 1;
    abstract void print1();
    void print2();
    void print3();
}
interface InterfaceTest2 extends InterfaceTest1{
    static void print4(){
        System.out.println("sss");
    }
}
