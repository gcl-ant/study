package day07;

public class homework05 {
    public static void main(String[] args) {
        int number = 5555555;
        int digits = 0;
        int temp = number;
        while (temp != 0) {
            digits++;
            temp /= 10;
        }
        System.out.println("这是一个" + digits + "位数。");

        System.out.print("逆序输出为：");
        while (number != 0) {
            System.out.print(number % 10);
            number /= 10;
        }
    }

}
