package mar21;

public class Hero {
    int exp;
    int level;
    int attack;

    public int attackMonster(Monster mon) {
        return mon.life - this.attack;
    }

    public Hero(int exp, int level, int attack) {
        this.exp = exp;
        this.level = level;
        this.attack = attack;
    }
}
