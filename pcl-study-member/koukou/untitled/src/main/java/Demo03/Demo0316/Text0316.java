package Demo03.Demo0316;

public class Text0316 {
    public static void main(String[] args) {
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
        System.out.println(" ");
        for (int i = 100; i <= 500 ; i++) {
            if(Math.pow(i / 100, 3)  + Math.pow(i / 10 % 10, 3)  + Math.pow(i % 10, 3)  == i){
                System.out.println(i + " ");
            }
        }
    }
}
