package Day16;

public interface IB1 extends IA {

    @Override
    default void m(){
        System.out.println("IB1 m");
    }
}
