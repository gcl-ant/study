package Day18;


import com.sun.org.apache.xpath.internal.functions.Function;

import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Lambda {
    public static void main(String[] args) throws Exception {

        //  不需要参数,返回值为5
        Callable<Integer> integerCallable = () -> 5;
        System.out.println(integerCallable.call());

        //接收一个参数(数字类型),返回其2倍的值
        Integer[] arr = new Integer[]{1, 2, 3, 4};
        Stream<Integer> loopStream = Arrays.stream(arr);
        loopStream.forEach(item -> System.out.println(10));

//        Function subtraction2 = x -> 2 * x;
//        System.out.println("bbbb" + subtraction2.apply(1).toString());

        //接受2个参数(数字),并返回他们的差值
        BiFunction<Integer, Integer, Integer> subtraction = (x, y) -> x - y;
        System.out.println("aaaa" + subtraction.apply(1, 2).toString());

        //接收2个int型整数,返回他们的和
        BiFunction<Integer, Integer, Integer> subtraction1 = (Integer x, Integer y) -> x - y;
        System.out.println("bbb" + subtraction.apply(2, 3).toString());

        //接受一个string对象,并在控制台打印,不返回任何值
        TestInfo<String> print = ()-> System.out.println("hello word");
        print accept();
    }
}
