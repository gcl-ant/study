package Demo03.Demo0320;

public class Text032003 extends Text032001{
    String name ;
    static int printName1(String number){
        System.out.println(number + "1");
        return 1;
    }
    int printName2(String number){
        System.out.println(number + "2");
        return 1;
    }
    final int printName3(String number){
        System.out.println(number + "3");
        return 1;
    }
    void Student(){
        System.out.println("aa");
    }
    Text032003(String name){
        this.Student();
        this.name = name;
    }
}
