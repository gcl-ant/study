package homeworkDemo;

public class Monster {
    public int getMonster;
    String name;
    int life;
    int level;
    int experience;

    Monster(String name, int level) {
        this.level = level;
        this.name = name;
        this.life = level * 1000;
        this.experience = level * 1000;
    }
//    public int getMonster() {
//        return life;
//    }

//    public int getExperience() {
//        return experience;
//    }

    public void setMonster(int life) {
        this.life = life;
    }

//    public void setExperience() {
//        this.experience = experience;
//    }

}
