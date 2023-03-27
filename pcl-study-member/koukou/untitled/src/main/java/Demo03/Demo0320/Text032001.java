package Demo03.Demo0320;

public class Text032001 {

    public static void main(String[] args) {
        print(123);
        print("123");
        //static 構照
        Text032002.print2(1234);
        Text032002.print2("1234");
        //static 構照 & 有參構照
        Text032002 testPrint = new Text032002();
        testPrint.print3(12345);
        testPrint.print3("12345");
    }
    //--------------------------------------------------
    static void print(int number){
        System.out.println(number);
    }
    static int print(String number){
        System.out.println(number);
        return 1;
    }
}
