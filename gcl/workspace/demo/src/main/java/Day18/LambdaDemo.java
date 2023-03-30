package Day18;

import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.stream.Stream;

public class LambdaDemo {
    public static void main(String[] args) throws Exception {
        //不需要参数，返回值为10

        //接受一个参数，返回其值得2倍
//        Callable<Integer> integerCallable2 = x -> 2 * x;
//        System.out.println(integerCallable2.call());
        Integer[] arr = new Integer[]{1, 2, 3, 4};

        Stream<Integer> loopStream  = Arrays.stream(arr);

        loopStream.forEach( item -> System.out.println(10));





    }
}
