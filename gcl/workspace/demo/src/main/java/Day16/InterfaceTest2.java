package Day16;

public interface InterfaceTest2 {
    public void print(String name);

    public void print1(String name);

    default void printDefault(){
        System.out.println("Test2 default method");
    }
}
