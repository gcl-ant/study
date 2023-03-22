package Demo03.Demo0321;

public class Monster {
    String name;
    int level;
    int hp;

//    Monster(int level){
//        this.level = level;
//        this.hp = this.level*1000;
//    }
    Monster(String name,int level){
        this.level = level;
        this.hp = this.level*1000;
        this.name = name;
    }
}
