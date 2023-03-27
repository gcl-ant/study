package Demo03.Demo0321;

public class Hero {
    int level;
    int atk;
    String name;


    public Hero(String name,int level){
        this.name = name;
        this.level = level;
        this.atk = level*100;
    }
    public int attack(Monster monster){
        return monster.getLife() - this.atk;
    }

    public static void main(String[] args) {
        Hero hero = new Hero("aa",1);
        Monster monster = new Monster("aa",1);
        System.out.println(monster.getLife());
    }
}
