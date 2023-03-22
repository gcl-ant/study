package day11And12.classdemo;

public class Hero {

    long expired;

    int level;

    int offensivePower;


    public int attack(Monster monster){
//        monster.setLife(10000);
        return monster.getLife() - this.offensivePower;
    }
}
