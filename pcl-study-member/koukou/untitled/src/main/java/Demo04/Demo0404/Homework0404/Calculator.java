package Demo04.Demo0404.Homework0404;

public class Calculator {
    int plus(int a,int b){
        System.out.println(a+b);
        return a+b;
    }
    int reduce(int a,int b){
        System.out.println(a-b);
        return a-b;
    }
    int take(int a,int b){
        System.out.println(a*b);
        return a*b;
    }
    int remove(int a,int b){
        System.out.println(a/b);
        return a/b;
    }
}
class keisann{
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.plus(1000,500);
        calculator.reduce(1000,500);
        calculator.take(100,10);
        calculator.remove(100,10);
    }
}