package day07;

public class BigStudent extends Student {

    String name;

    public void drinkJiu() {
        if (super.age >= 20) {
            System.out.println("20岁了，能喝酒了");
        } else {
            System.out.println("年龄未满，不能喝酒");
        }
    }

//    public BigStudent() {
//
//    }
    public BigStudent() {
        this.name = "田纪云";
        super.age = 18;
    }

    public BigStudent(String name, int age) {
        this.name = name;
        super.age = age;
    }
}
