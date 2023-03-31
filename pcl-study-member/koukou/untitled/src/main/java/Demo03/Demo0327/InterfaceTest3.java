package Demo03.Demo0327;

public class InterfaceTest3 implements InterfaceTest1,InterfaceTest2 {
    @Override
    public void print(String name) {
        System.out.println("print" + name);
    }
    @Override
    public void printDefault() {
        InterfaceTest1.super.printDefault();
        InterfaceTest2.super.printDefault();
    }
}
