package day12;

public class Hero {
    private int level;
    private int exp;
    private int getExpForLevel(int level) {
        return 30 * (level * level * level + 5 * level) - 80;
    }

    public Hero(int exp) {
        if (exp < 0) {
            this.exp = 0;
        } else if (exp > getExpForLevel(30)) {
            this.exp = getExpForLevel(30);
        } else {
            this.exp = exp;
        }
        this.level = getLevelForExp(this.exp);
    }

    private int getLevelForExp(int exp) {
        int level = 0;
        while (exp >= getExpForLevel(level + 1) && level < 30) {
            level++;
        }
        return level;
    }

    public int getLevel() {
        return level;
    }

    public int getExp() {
        return exp;
    }

    public Hero() {
        this(0);
    }

    public static void main(String[] args) {
        Hero hero1 = new Hero();
        Hero hero2 = new Hero(6543211);
        Hero hero3 = new Hero(-100);

        System.out.println("Hero1的等级为：" + hero1.getLevel() + "，经验值为：" + hero1.getExp());
        System.out.println("Hero2的等级为：" + hero2.getLevel() + "，经验值为：" + hero2.getExp());
        System.out.println("Hero3的等级为：" + hero3.getLevel() + "，经验值为：" + hero3.getExp());
    }
}

