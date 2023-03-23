package day10;

public class TestPrint {

    public static void main(String[] args) {
       // 如何调用成员变量和成员方法？  default 权限 private


//        Student liuyiYang = new Student();
//        System.out.println(liuyiYang.name);
//        System.out.println(Student.name2);
//        liuyiYang.printName2("aaaaa");
//        Student.printName("xiaoliu");

//        Student liuyiYang = new Student("刘易阳");
//        System.out.println(liuyiYang.name);
//        liuyiYang.printName3("123");
//
//        Student tianjiyun = new Student("田吉云");
//        System.out.println(tianjiyun.name);

        Student tianjiyun2 = new Student();
        System.out.println(tianjiyun2.name);
    }

    int print3(int number){
        System.out.println(number);
        return 2;
    }
    static int print2(int number){
        System.out.println(number);
        return 2;
    }

    int print3(String number){
        System.out.println(number);
        return 1;
    }
    static int print2(String number){
        System.out.println(number);
        return 1;
    }
}
