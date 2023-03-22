package day10;

public class Student extends Perople{
    //成员属性 public private protected default
    // 权限控制关键字  成员变量数据类型  成员变量名  初期値
    String name ;

//    static String name2 = "刘さん";
//
//    private String name3 = "刘さん";
//
//    private  static String name4 = "刘さん";

    //成员方法
    //权限控制关键字 [static] 成员变量数据类型  方法名 (  参数类型 参数名【行参】 ,....... ) { souce }
    static  int printName(String number){
        System.out.println(number);
        return 1;
    }

     int printName2(String number){
        System.out.println(number);
        return 1;
    }


    final int printName3(String number){
        System.out.println(number);
        return 1;
    }

    void Student(){
        System.out.println("aa");
    }

    Student(){
        this.name = name;
    }

    Student(String name){
        this.Student();
        this.name = name;

    }

    @Override
    int print() {
        return 0;
    }
}
