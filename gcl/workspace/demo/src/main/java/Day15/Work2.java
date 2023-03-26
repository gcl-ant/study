package Day15;

//public class Work2 {
////    public static void main(String[] args) {
////        Hero2 e = new Hero2();
////
////        System.out.print("无参构造的");
////        System.out.println("经验值为：" + e.EXP + " 时，等级为：" + e.grade + " 级");
////
////        int a = 120000;
////        Hero2 h = new Hero2(a);
////        System.out.print("有参构造的");
////
////        for (int i = 1; i <= 30; i++) {
////            System.out.println(i + "级经验值：" + (30 * (i * i * i + 5 * i) - 80));
////            if ((30 * (i * i * i + 5 * i) - 80) <= h.EXP && (30 * ((i + 1) * (i + 1) * (i + 1) + 5 * (i + 1)) - 80) > h.EXP) {
////
////                System.out.println("经验值为：" + h.EXP + " 时，等级为：" + h.grade + " 级");
////            }
////        }
////
////
////    }
//
//
//}

//
//public class Hiro {
////    int hp=0;//血量
//    private int exp;// 经验值
//    private int level;// 等级
////    int attack=10; //攻击力
////    public int attack (Monster monster){
////        return monster.hp-this.attack;//击打方法
////    }
//    public Hiro(){
//        this.level = calculateLevel(0);
//    }
//    public Hiro(int exp){
//        if (exp<0){
//            exp=0;
//        }else if (exp > 30 * 30 * 30 + 5 * 30 - 80){
//            this.exp = 30 * 30 * 30 + 5 * 30 - 80;
//        } else {
//            this.exp=exp;
//        }
//        this.level = calculateLevel(this.exp);
//
//    }
//    public int calculateLevel(int exp){
//        int level = 0;
//        while (exp >= 30 * (level * level * level + 5 * level) - 80) {
//            level++;
//        }
//        return level-1 ;
//    }
//
//    public int getExp() {
//
//        return exp;
//    }
//    public int getLevel() {
//        return level;
//    }
//
//
//    public static void main(String[] args) {
//        Hiro hiro1 = new Hiro();
//        System.out.println("英雄一的等级: " + hiro1.getLevel() + "经验: " + hiro1.getExp());
//        Hiro hiro2 = new Hiro(1000 );
//        System.out.println("英雄二的等级: " + hiro2.getLevel()+ " 经验: " + hiro2.getExp());
//    }
//}
