package Day15;


/**
 * 英雄的级别最低为0，最高为30级，经验值最低为0，最高为30级时的经验值
 * 该类中要求有一个含有参数的构造函数，参数为英雄的经验值，初始化时要保证经验值在要求范围之内，通过经验值计算英雄的级别，英雄的级别计算公式如下：
 * N=当前级别，EXP（经验值）=30（N^3+5N）-80
 * 构建一个无参的构造方法，将经验值设置为0
 * 利用英雄类无参和带有参数的构造函数分别构建英雄对象，并输出英雄的等级和经验值。
 */
public class Hero {
    //成员属性
    //等级   int   0--30
    private int level;

    //经验  0 --30
    private int exp;

    public Hero(int exp) {
        //要保证经验值在要求范围之内
        int minExp = 0;
        int maxExp = calcExp(30);
        if (exp < minExp) {
            exp = 0;
        } else if (exp > maxExp) {
            exp = maxExp;
        }

        // 根据经验值计算等级
        int n = 0;
        for (int i = 0; i <= 30; i++) {
            if (exp >= calcExp(i)) {
                n = i;
            } else {
                break;
            }
        }

        this.level = n;
        this.exp = exp;
    }

    public Hero() {
        this(0);
    }

    public int getLevel() {
        return level;
    }

    public int getExp() {
        return exp;
    }

    public void printInfo() {
        System.out.println("英雄的等级是:" + this.level);
        System.out.println("英雄的经验值是:" + this.exp);
    }

    /**
     * 计算经验的公式
     * 30 * (30*30*30 + 5 *30) -80
     *
     * @param level
     * @return
     */
    public int calcExp(int level) {
        return Double.valueOf(30 * (Math.pow(level, 3) + 5 * level) - 80).intValue();
    }

}
