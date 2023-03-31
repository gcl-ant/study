package Day19;

public class Test {
    int age = 11;

    final String name = "小王吧";


    static String myClass = "三年二班";

//
//    public static void main(String[] args) {
//
////        Foo foo = () -> System.out.println(age);
////        Foo foo2 = () -> System.out.println(name);
//        Foo foo3 = () -> System.out.println(myClass);
//        Test test = new Test();
//
//        Foo foo4 = () -> System.out.println(test.age);
//        Foo foo5 = () -> System.out.println(test.name);
//        Foo foo6 = () -> System.out.println(test.myClass);
//        Foo foo7 = () -> System.out.println(Test.myClass);
//        foo7.print2();
//
//        //工厂模式
//        IntegerFactory factory = Integer::valueOf;
//        Integer integer = factory.createInteger("123");
//        System.out.println(integer);
//
//
//        IntegerFactory<String> factory2 = (String x) -> MyInteger.valueOf(x);
//        Integer integer2 = factory2.createInteger("123");
//        System.out.println(integer2);
//
//    }

    public static void main(String[] args) {
//        System.out.println("演示异常发生情况：");
////除数为0，运行的时候程序会抛出一个异常
//        System.out.println(100 / 0);
//        System.out.println("如果我被打印出来，就是异常被处理了。");

//        int[] a=new int[1024*1024*10241024*1024*1024*1024*1024*1024];
        int i = 1;
        for (;;){
            int j = i++;
            System.out.println(j);
        }
    }

}
