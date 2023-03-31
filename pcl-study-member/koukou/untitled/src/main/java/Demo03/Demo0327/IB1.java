package Demo03.Demo0327;

public interface IB1 extends IA {
    @Override
    default void print1(){
        System.out.println("IB1");
    }
}
