package Demo03.Demo0317;

public class Text031702 extends Text031701{

    @Override

    public String getName1() {
        return this.name + "hahaha";
    }

    public static void main(String[] args) {
        Text031701 hero = new Text031701();
        System.out.println(hero.getName1());
        Text031702 hero2 = new Text031702();
        System.out.println(hero2.getName1());
    }
}
