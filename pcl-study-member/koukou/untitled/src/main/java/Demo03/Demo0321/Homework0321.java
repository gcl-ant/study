package Demo03.Demo0321;

public class Homework0321 {
//    自定义一个英雄类
//    英雄的级别最低为0，最高为30级，经验值最低为0，最高为30级时的经验值
//    该类中要求有一个含有参数的构造函数，参数为英雄的经验值，初始化时要保证经验值在要求范围之内，通过经验值计算英雄的级别，英雄的级别计算公式如下：
//    N=当前级别，EXP（经验值）=30（N^3+5N）-80
//    构建一个无参的构造方法，将经验值设置为0
//    利用英雄类无参和带有参数的构造函数分别构建英雄对象，并输出英雄的等级和经验值。
//    int level,exp;
//    Homework0321(int level){
//        int a = level>=0&&level<=30?level
//                :(level<0?0:30);
//        this.level = a;
//        this.exp = a==0?exp:30*(a*a*a+5*a)-80;
//    }
//    public static void main(String[] args) {
//        Homework0321 hero = new Homework0321(30);
//        System.out.println("等級:"+hero.level);
//        System.out.println("經驗:"+hero.exp);
//    }
    private int level,exp;
    public int getLevel() {
        return level;
    }
    public int getExp() {
        return exp;
    }
    public Homework0321() {
        this(0);
    }
    public int calcExp(int level) {
        return Double.valueOf(30 * (Math.pow(level, 3) + 5 * level) - 80).intValue();
    }
    public Homework0321(int exp) {
//        int minExp = 0;
//        int maxExp = calcExp(30);
//        if (exp < minExp) {
//            exp = 0;
//        } else if (exp > maxExp) {
//            exp = maxExp;
//        }
//        this.exp = exp;
    this.exp = exp>=0&&exp<=calcExp(30)?exp
                :(exp<0?0:calcExp(30));
        int n = 0;
        for (int i = 0; i <= 30; i++) {
            if (exp >= calcExp(i)) {
                n = i;
            } else {
                break;
            }
        }
        this.level = n;
    }
    public void printInfo() {
        System.out.println("等級:" + this.level);
        System.out.println("經驗:" + this.exp);
    }
    public static void main(String[] args) {
        Homework0321 hero1 = new Homework0321();
        Homework0321 hero2 = new Homework0321(2000);
        Homework0321 hero3 = new Homework0321(814421);
        Homework0321 hero4 = new Homework0321(-1);

        hero1.printInfo();
        hero2.printInfo();
        hero3.printInfo();
        hero4.printInfo();
    }
}
