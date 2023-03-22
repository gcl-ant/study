package mar21;

public class Monster {
    int life;
    int level;

    public Monster(int level) {
        this.life = level * 1000;
        this.level = level;
    }

}
