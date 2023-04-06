package homeworkApirl;

public class Calculator {
    private int n1;
    private int n2;
    private int sum;

    public Calculator(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public void add(int n1, int n2) {
        sum = n1 + n2;
        System.out.println(sum);
    }

    public void sub(int n1, int n2) {
        sum = n1 - n2;
        System.out.println(sum);
    }

    public void mul(int n1, int n2) {
        sum = n1 * n2;
        System.out.println(sum);
    }

    public void div(int n1, int n2) {
        sum = n1 / n2;
        System.out.println(sum);
    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator(77,88);
        calculator.add(12,34);
        calculator.sub(10,100);
        calculator.mul(22,2);
        calculator.div(33,3);
    }
}
