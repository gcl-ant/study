package Day15;

public class Test {
    //2、自定义一个英雄类
    //英雄的级别最低为0，最高为30级，经验值最低为0，最高为30级时的经验值
    //该类中要求有一个含有参数的构造函数，参数为英雄的经验值，初始化时要保证经验值在要求范围之内，通过经验值计算英雄的级别，英雄的级别计算公式如下：
    //N=当前级别，EXP（经验值）=30（N^3+5N）-80
    //构建一个无参的构造方法，将经验值设置为0
    //利用英雄类无参和带有参数的构造函数分别构建英雄对象，并输出英雄的等级和经验值。
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        Hero hero2 = new Hero(2000);
        Hero hero3 = new Hero(8144210);
        Hero hero4 = new Hero(-100);

        hero1.printInfo();
        hero2.printInfo();
        hero3.printInfo();
        hero4.printInfo();

//        System.out.println(hero3.calcExp(30));

//        Tank huShi = new Tank();

        Interface3 interface3 = new Interface3();
        interface3.print4();    }
}
