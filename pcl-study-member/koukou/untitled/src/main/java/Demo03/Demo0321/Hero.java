package Demo03.Demo0321;

public class Hero {
    int level;
    int atk;
    int exp;


    public Hero(int level,int exp){
        this.level = level;
        this.atk = level*100;
        this.exp = exp;
    }
    public int kougeki(Monster monster){
        return monster.hp - this.atk;
    }

    public static void main(String[] args) {
        Hero hero = new Hero(1,200);
        Monster monster = new Monster("aa",1);
        System.out.println(monster.hp);
    }
}
