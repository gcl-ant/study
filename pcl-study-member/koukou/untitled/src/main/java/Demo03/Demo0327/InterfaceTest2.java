package Demo03.Demo0327;

public interface InterfaceTest2 {
    public void print(String name);
    default void printDefault(){
        System.out.println("Test2 default");
    }
}