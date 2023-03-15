public class HomeWork05 {
    public static void main(String[] args) {
        int num = 3456777;
        int count =0;
        while (num > 0){
            int yu = num % 10;
            System.out.println(yu);
            num /= 10;
            count++;
        }
        System.out.println("该数为 "+ count +" 位数");
    }
}
