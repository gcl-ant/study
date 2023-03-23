package homeworkDemo;

public class Hero {
    long experience;
    int level;
    int offensivePower;

    public int attack(Monster monster){
        return monster.life-this.offensivePower;
    }

}
