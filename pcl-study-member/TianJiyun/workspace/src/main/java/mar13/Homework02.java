package mar13;

public class Homework02 {
    public static void main(String[] args) {
        System.out.println("10到105之间的素数有:");
        for (int i = 10; i <= 105; i++) {
            boolean temp = true;
            for (int j = 2; j < i; j++) {
                if(i % j == 0){
                    temp = false;
                    break;
                }
            }
            if(temp == true){
                System.out.print(i + " ");
            }
        }
    }
}
