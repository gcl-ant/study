package Demo04.Demo0408;

import Demo04.Demo0408.Homework0408.Calculator;
import Demo04.Demo0408.Homework0408.CalculatorImpl;

import java.lang.reflect.Proxy;

public class HomeWork1 {
    public static void main(String[] args) {

        //PPT09 01
        Calculator calculator = new CalculatorImpl();
        Logger logger = new Logger(calculator);
        Calculator proxy = (Calculator) Proxy.newProxyInstance(
                Calculator.class.getClassLoader(),
                new Class[]{Calculator.class},
                logger
        );

        for(int i = 0;i<300;i++){
            int result = proxy.add(1,2);
        }

//        System.out.println(result);
        for(int i = 0;i<299;i++){
            int result = proxy.substract(3,4);
        }

        logger.printMethodStatictics();
    }
}
