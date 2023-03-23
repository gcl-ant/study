package mar21homework;

public class Test {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        Hero hero2 = new Hero(500000);
        Hero hero3 = new Hero(1000000);
        System.out.println(hero1.getLevel());
        System.out.println(hero2.getLevel());
        System.out.println(hero3.getLevel());
    }
}
