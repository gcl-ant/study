package Day16;

public class ImplementTest3 implements InterfaceTest1,InterfaceTest2 {


    @Override
    public void print(String name) {
        System.out.println("print implement" + name);
    }

    @Override
    public void printDefault() {
        InterfaceTest1.super.printDefault();
        InterfaceTest2.super.printDefault();
    }

    @Override
    public void print1(String name) {

    }


}
