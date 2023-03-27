package Day16;

public interface IB2 extends IA {

    @Override
    default void m(){
        System.out.println("IB2 m");
    }
}
