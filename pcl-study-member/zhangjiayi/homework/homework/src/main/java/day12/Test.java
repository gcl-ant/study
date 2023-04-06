package day12;

public class Test {
    public static void main(String[] args) {
        // 创建一个英雄对象，经验值为0
        Hero hero1 = new Hero();
        System.out.println("英雄1的等级为：" + hero1.getLevel());
        System.out.println("英雄1的经验值为：" + hero1.getExp());

        // 创建一个英雄对象，经验值为1000
        Hero hero2 = new Hero(1000);
        System.out.println("英雄2的等级为：" + hero2.getLevel());
        System.out.println("英雄2的经验值为：" + hero2.getExp());

        // 创建一个英雄对象，经验值为27000
        Hero hero3 = new Hero(-100);
        System.out.println("英雄3的等级为：" + hero3.getLevel());
        System.out.println("英雄3的经验值为：" + hero3.getExp());

        // 创建一个英雄对象，经验值为30000
        Hero hero4 = new Hero(3000000);
        System.out.println("英雄4的等级为：" + hero4.getLevel());
        System.out.println("英雄4的经验值为：" + hero4.getExp());
    }
}


