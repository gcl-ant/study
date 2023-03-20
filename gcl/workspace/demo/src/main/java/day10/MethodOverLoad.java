package day10;

public class MethodOverLoad {
    public static void main(String[] args) {
        // 6 - 12 - 13  7 -17 -18 -9
        //tian  8 - 12 - 13  7 - 15 -16- 17-10  li   8 - 12 - 13 14  huang 7 - 15 - 16 - 17 - 8 - 11 - 12- 13 - 10 other
        // 8 - 14 15 16 9 18 19 20 12
        print(123);
        print("123");

        TestPrint.print2(1234);
        TestPrint.print2("1234");


        // 16  18
        TestPrint testPrint = new TestPrint();
        testPrint.print3(12345);
        testPrint.print3("12345");

    }
    // 7 - 16 17 18 19 8 12 13 14 15 10
    static void print(int number){
        System.out.println(number);
        if (1 > 2){
            return;
        }
        //dsadasdasd

    }
    static int print(String number){
        System.out.println(number);
        return 1;
    }


}
