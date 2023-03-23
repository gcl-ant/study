package Demo03.Demo0321;

public class Homework0321 {
//    PPT4 作業2
//    自定义一个英雄类
//    英雄的级别最低为0，最高为30级，经验值最低为0，最高为30级时的经验值
//    该类中要求有一个含有参数的构造函数，参数为英雄的经验值，初始化时要保证经验值在要求范围之内，通过经验值计算英雄的级别，英雄的级别计算公式如下：
//    N=当前级别，EXP（经验值）=30（N^3+5N）-80
//    构建一个无参的构造方法，将经验值设置为0
//    利用英雄类无参和带有参数的构造函数分别构建英雄对象，并输出英雄的等级和经验值。
    int level;
    int exp;
    Homework0321(int level){
        int a = level>=0&&level<=30?level:0;
        this.level = a;
        this.exp =level==0?exp:30*(a*a*a+5*a)-80;
    }
    public static void main(String[] args) {
        Homework0321 hero = new Homework0321(0);
        System.out.println(hero.level);
        System.out.println(hero.exp);
    }
}
