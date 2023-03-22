package day11And12.extranddemo;

public class Test {
    public static void main(String[] args) {
        Husband xiaowang = new Husband();
        Wife xiaoming = new Wife("bbb",xiaowang);

        xiaowang.drive();
        xiaowang.run();
        xiaoming.cook();
        xiaoming.run();
    }
}
