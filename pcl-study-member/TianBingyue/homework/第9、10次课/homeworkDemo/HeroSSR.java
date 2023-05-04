package homeworkDemo;

public class HeroSSR {
    String name;
    int level;
    int maxLv = 30;
    int experience;
    String offensivePower;


    public HeroSSR(String name) {
        this.name = "ONE PUNCH MAN";
        this.experience = 0;
        this.level = countLv(this.experience);
        this.offensivePower = "one punch";
    }

    int N = level;

    public int countEx(int N) {
        int EX = 30 * (N ^ 3 + 5 * N) - 80;
        return (int) EX;
        //return N;
    }

    public int countLv(int experience) {
        int level = 0;
        int EX = 30 * (N ^ 3 + 5 * N) - 80;
        for (int N = 1; N <= 30 + 1; N++) {
            if (EX > experience) {
                level = N - 1;
                break;
            }
        }
        return level;
        //=30 (N ^ 3 + 5 N)-80;
    }

    public void attackMonster(Monster monster) {
        System.out.println(this.name + "攻击了" + monster.name);
        int hp = monster.getMonster;
        if (hp > 0) {
            hp = hp - monster.life;
        }
        monster.setMonster(hp);
        System.out.println("Monster is dead");

        if (this.level < maxLv) {
            this.experience = this.experience + monster.experience;
            if (this.experience >= countEx(this.level + 1)) {
                this.level = this.level + 1;
                System.out.println(this.name + "升到了" + this.level + "级");
            }
        } else {
            System.out.println("升到了[不可观测]");

        }
    }


}

