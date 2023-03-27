package Demo03.Demo0321;

public class Monster {
    String name;
    int level;
    int hp;

    public int getLife() {
        return hp;
    }
    public void setLife(int hp) {
        this.hp = hp;
    }
    Monster(String name,int level){
        this.level = level;
        this.hp = this.level*1000;
        this.name = name;
    }
}
