package day1112;

public class Hero {
    private int level;
    private int exp;
    private int getExpForLevel(int level) {
        return 30 * (level * level * level+ 5 * level) - 80;
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

    public Hero() {
        this(0);
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

    public static void main(String[] args) {
        Hero hero1 = new Hero(); // 使用无参构造方法创建一个英雄对象
        Hero hero2 = new Hero(123456); // 使用有参构造方法创建一个英雄对象

        System.out.println("Hero1的等级为：" + hero1.getLevel() + "，经验值为：" + hero1.getExp());
        System.out.println("Hero2的等级为：" + hero2.getLevel() + "，经验值为：" + hero2.getExp());
    }
}

