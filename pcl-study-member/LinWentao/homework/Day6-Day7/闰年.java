package Day6;

public class 闰年 {
    public static void main(String[] args) {

        for (int year = 2000; year <= 3000 ; year++) {
            if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
                System.out.println("2000年到3000年中的闰年是:"+year);;
            }
        }
    }
}
