package Day18;


import Day18.TestInfo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {

        String[] arr = new String[]{"a", "b ", "#"};
//        Arrays.stream(arr).forEach();
        BiFunction<Integer, Integer, Integer> subtraction = (x, y) -> x - y;
        System.out.println("aaaa" + subtraction.apply(1, 2).toString());

        Function<Integer, Integer> subtraction2 = x -> 2 * x;
        System.out.println("bbbb" + subtraction2.apply(1).toString());


        BiFunction<Integer, Integer, Integer> subtraction3 = (Integer x, Integer y) -> x - y;
        System.out.println("cccc" + subtraction3.apply(2, 3).toString());

        Consumer<String> printer = (String s) -> System.out.println(s);
        printer.accept("aaaaaaa");

//        TestInfo<String> print2 = (String s) -> System.out.println(s);
//        print2.accept("vvvvvv");
//
//        TestInfo<Integer> print3 = (Integer s) -> System.out.println(s);
//        print3.accept(new Integer(3));

        TestInfo<String> print3 = () -> System.out.println("abc");
        print3.accept2();

    }
}
