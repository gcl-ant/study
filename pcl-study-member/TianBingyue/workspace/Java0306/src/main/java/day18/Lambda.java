//package day18;
//
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.concurrent.Callable;
//import java.util.stream.Stream;
//
//public class Lambda {
//    //Lambda表达式语法示例
//
//    Lambda lambda = new Lambda();
//    MathOperation addition = (int a, int b) -> a + b;
//
//    public static void main(String[] args) throws Exception{
//        Callable<Integer> integerCallable2 = x -> 2 * x;
////        System.out.println(integerCallable2.call());
//        Integer[] arr = new Integer[]{1, 2, 3, 4};
//
//        Stream<Integer> loopStream  = Arrays.stream(arr);
//
//        loopStream.forEach( item -> System.out.println(5));
//
//    }
//
//}
//
//
//    // 类型声明
//    MathOperation addition = (int a, int b) -> a + b;
//
//    // 不用类型声明
//    MathOperation subtraction = (a, b) -> a - b;
//
//    // 大括号中的返回语句
//    MathOperation multiplication = (int a, int b) -> { return a * b; };
//
//    // 没有大括号及返回语句
//    MathOperation division = (int a, int b) -> a / b;
//
//      System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
//              System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
//              System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
//              System.out.println("10 / 5 = " + tester.operate(10, 5, division));
//
//              // 不用括号
//              GreetingService greetService1 = message ->
//              System.out.println("Hello " + message);
//
//              // 用括号
//              GreetingService greetService2 = (message) ->
//              System.out.println("Hello " + message);
//
//              greetService1.sayMessage("Runoob");
//              greetService2.sayMessage("Google");
//              }
//
//interface MathOperation {
//    int operation(int a, int b);
//}
//
//interface GreetingService {
//    void sayMessage(String message);
//}
//
//    private int operate(int a, int b, MathOperation mathOperation){
//        return mathOperation.operation(a, b);
//    }
//}