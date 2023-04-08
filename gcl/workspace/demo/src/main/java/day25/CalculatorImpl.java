package day25;

public class CalculatorImpl implements Calculator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int substract(int a, int b) {
        return a - b;
    }
}
