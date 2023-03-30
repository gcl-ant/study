package mar30;

public class LambdaHomework {
    I1 i1 = () -> 5;
    I2 i2 = x -> 2 * x;
    I3 i3 = (x, y) -> x - y;
    I4 i4 = (int x, int y) -> x + y;
    I5 i5 = (String s) -> System.out.println(s);
    public static void main(String[] args) {
        LambdaHomework lambdaHomework = new LambdaHomework();
        System.out.println(lambdaHomework.i1.method1());
        System.out.println(lambdaHomework.i2.method2(10));
        System.out.println(lambdaHomework.i3.method3(1, 2));
        System.out.println(lambdaHomework.i4.method4(2, 3));
        lambdaHomework.i5.method5("hello world");
    }
}
interface I1{
    public int method1();
}
interface I2{
    public int method2(int num);
}
interface I3 {
    public int method3(int num1, int num2);
}
interface I4{
    public int method4(int num1, int num2);
}
interface I5 {
    public void method5(String str);
}