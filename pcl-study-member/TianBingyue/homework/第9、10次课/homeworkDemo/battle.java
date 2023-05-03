package homeworkDemo;

public class battle {
    public String getHero(HeroSSR HeroSSR) {
        return HeroSSR.name;
    }

    public int getLv(HeroSSR HeroSSR) {
        return HeroSSR.level;
    }

    public static void main(String[] args) {
        System.out.println("===== ONE PUNCH MAN meet a little Monster=====");
        HeroSSR HeroSSR = new HeroSSR("ONE PUNCH MAN");
        Monster monster1 = new Monster("BBQ", 10);
        HeroSSR.attackMonster(monster1);
    }


}
