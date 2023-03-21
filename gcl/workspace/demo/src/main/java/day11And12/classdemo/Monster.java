package day11And12.classdemo;

public class Monster {

    String name;

    // 私有
    private int life;
    int level;

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    Monster(int level){
        this.level = level;
        this.life = level * 1000;
    }

    Monster(String name ,int level){
        this(level);
        this.name = name;
    }
}
