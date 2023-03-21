package code.src.main.March13.src.main.java;

public class HomeWork06 {
    public static void main(String[] args) {
        System.out.println("2000年到3000年中的闰年:");
        for (int year = 2000; year <= 3000 ; year++) {
            if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
                System.out.println(year);
            }
        }
    }
}
