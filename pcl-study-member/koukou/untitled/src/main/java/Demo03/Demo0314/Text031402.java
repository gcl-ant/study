package Demo03.Demo0314;

public class Text031402 extends Text031401 {
    String name;
    public void drinkJiu() {
        if (super.age >= 20) {
            System.out.println("20歲了，能喝酒了");
        } else {
            System.out.println("年龄未滿，不能喝酒");
        }
    }
    public Text031402() {
        this.name = "黃同學1";
        super.age = 18;
    }
    public Text031402(String name, int age) {
        this.name = name;
        super.age = age;
    }
}
