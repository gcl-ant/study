public class HomeWork03 {
    public static void main(String[] args) {
        System.out.println("100到500之间水仙花数:");

        for (int i = 100; i <= 500 ; i++) {
            if(Math.pow(i / 100, 3)  + Math.pow(i / 10 % 10, 3)  + Math.pow(i % 10, 3)  == i){
                System.out.println(i + " ");
            }
        }
    }
}
