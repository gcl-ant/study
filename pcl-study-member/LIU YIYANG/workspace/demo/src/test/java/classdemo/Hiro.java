package classdemo;

    public class Hiro {
        int hp=0;//血量
        int exp=0;// 经验值
        int level=1;// 等级
        int attack=10; //攻击力
        public int attack (Monster monster){
            return monster.hp-this.attack;//击打方法
        }
        public Hiro(){
            this.level = calculateLevel(this.exp);
        }
        public Hiro(int exp){
            if (exp<0){
                exp=0;
            }else if (exp > 30 * 30 * 30 + 5 * 30 - 80){
                this.exp = 30 * 30 * 30 + 5 * 30 - 80;
            } else {
                this.exp=exp;
            }
            this.level=level = calculateLevel(this.exp);

        }
        public int calculateLevel(int exp){
            int level = 0;
            while (exp >= 30 * level * level * level + 5 * level - 80) {
                level++;
            }
            return level-1 ;
        }

        public int getExp() {

            return exp;
        }
        public int getLevel() {
            return level;
        }


        public static void main(String[] args) {
            Hiro hiro1 = new Hiro();
            System.out.println("英雄一的等级: " + hiro1.getLevel() + "经验: " + hiro1.getExp());
            Hiro hiro2 = new Hiro(1000 );
            System.out.println("英雄二的等级: " + hiro2.getLevel()+ " 经验: " + hiro2.getExp());
        }
    }
