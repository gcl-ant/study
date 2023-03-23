package mar13;

public class Homework01 {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 2;
        int numt = 0;
        for (int month = 1; month <= 12 ; month++) {
            if (month >= 3){
                numt = num1 + num2;
                num1 = num2;
                num2 = numt;
            }
        }
        System.out.println("一年以后兔子的数量为:" + numt);
    }
}
