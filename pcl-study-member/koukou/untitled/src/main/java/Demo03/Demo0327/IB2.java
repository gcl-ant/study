package Demo03.Demo0327;

public interface IB2 extends IA {
    @Override
    default void print1(){
        System.out.println("IB2");
    }
}
