package D0405题目;

public class hero {
    String name;
    int experience;
    int level;
    int attack;
    public hero(String name,int experience, int level, int attack) {
        this.experience = experience;
        this.level = level;
        this.attack = attack;
    }
    public int attackMonster(Monster monster) {
        return monster.leftlife - this.attack;
    }

}
