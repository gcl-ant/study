package Day16;

public interface InterfaceTest1 {
    public void print(String name);

    default void printDefault(){
        System.out.println("Test1 default method");
    }
}
