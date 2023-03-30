package Day18;

import java.util.Objects;
import java.util.function.Consumer;

public interface TestInfo<T> {

//    void accept(T t);

    void accept2();

    default void print(){
        System.out.println("aaaa");
    }
}
