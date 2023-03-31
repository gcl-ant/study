package Demo03.Demo0317;

public class Test031702 extends Test031701 {

    @Override

    public String getName1() {
        return this.name + "hahaha";
    }

    public static void main(String[] args) {
        Test031701 hero = new Test031701();
        System.out.println(hero.getName1());
        Test031702 hero2 = new Test031702();
        System.out.println(hero2.getName1());
    }
}
