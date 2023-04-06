package D0405题目;

public class Monster {
    String name;
    int level;
    int leftlife;

    public int getLife()  {
        return leftlife;
    }

    public void setLife(int life) {
        this.leftlife = life;
    }

    Monster(String name, int level) {
        this.level = level;
        this.leftlife = this.level * 1000;
        this.name = name;
    }

}

