package March21homework;
public class Test {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        Hero hero2 = new Hero(0);
        System.out.println(hero1.getLevel());
        System.out.println(hero2.getLevel());
    }
}