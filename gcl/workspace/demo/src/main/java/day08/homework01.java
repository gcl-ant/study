package day08;

public class homework01 {

    public static void main(String[] args) {
        //for 增强循环演示
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int item : array) {
            System.out.println(item);
        }

        System.out.println("第二种循环");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }

        //判断10-105之间有多少个素数，并输出所有素数。
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
