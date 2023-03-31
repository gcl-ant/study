package Demo03.Demo0330;

public class Test033001 {
    public static void main(String[] args) {

//        不需要参数,返回值为 5  :() -> 5
//        接收一个参数(数字类型),返回其2倍的值：  x -> 2 * x
//        接受2个参数(数字),并返回他们的差值：  (x, y) -> x – y
//        接收2个int型整数,返回他们的和：  (int x, int y) -> x + y
//        接受一个 string 对象,并在控制台打印,不返回任何值(看起来像是返回void):  (String s) -> System.out.print(s)

        Test ifoo = () -> System.out.println("lambda");
        Print ifoo1 = s -> System.out.println(s);
        Print ifoo2 = (s) -> System.out.println(s);
        ifoo.test();
        ifoo1.print("aaaa");
        ifoo2.print("bbbb");

        Print1 print1 = (int a,int b) -> a+b;
        Print1 print2 = (a,b) -> a-b;
        Print1 print3 = (int a,int b) -> {return a*b;};
        Print1 print4 = (int a,int b) -> a/b;

        Test033001 text = new Test033001();
        System.out.println(text.Print2(10,5,print1));
        System.out.println(text.Print2(10,5,print2));
        System.out.println(text.Print2(10,5,print3));
        System.out.println(text.Print2(10,5,print4));
    }
    interface Test {
        void test();
    }
    interface Print {
        void print(String s);
    }
    interface Print1 {
        int print1(int a,int b);
    }
    int Print2(int a,int b,Print1 print1){
        return print1.print1(a,b);
    }
}