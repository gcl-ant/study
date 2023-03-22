package Demo03.Demo0316;

public class Homework031604 {

    public static void main(String[] args) {
        System.out.println("----------------05-------------");
        int number = -1234567;
        int digits = 0;
        int temp = number;
        while (temp != 0) {
            digits++;
            temp /= 10;
        }
        System.out.println("这是一个" + digits + "位数。");
        System.out.print("逆序输出为：");
        if (number<0)
        {number=-number;
            System.out.print("-");}
        while (number != 0) {
            System.out.print(number % 10);
            number /= 10;
        }
        System.out.println();
        System.out.println("----------------05-------------");
    }
}
