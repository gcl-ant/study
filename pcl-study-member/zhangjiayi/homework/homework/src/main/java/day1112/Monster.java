package day1112;

public class Monster {
    private String name;
    private int level;
    private int hp;

    public int getHp() {
        return hp;
    }

    Monster(int level) {
        this.level = level;
        this.hp = level * 1000;
    }
    Monster(String name ,int level){
        this(level);
        this.name = name;
    }

}

