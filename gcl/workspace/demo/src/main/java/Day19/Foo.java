package Day19;


@FunctionalInterface
public interface Foo {
    void print();

    default void print2() {
        System.out.println("aaaa");
    }

    default void print3() {
        System.out.println("bbbb");
    }


    //注解:@Override   FunctionInterface
}
