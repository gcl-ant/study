package mar21homework;

public class Hero {
    private int level;
    private int exp;

    public Hero() {
        this.exp = 0;
        this.level = 0;
    }

    public Hero(int exp) {
        this.calLevel(exp);
    }

    public int getLevel() {

        return level;
    }

    public void setLevel(int level) {

        this.level = level;
    }

    public int getExp() {

        return exp;
    }

    public void setExp(int exp) {

        this.exp = exp;
    }

    private void calLevel(int exp) {
        int[] exps = new int[30];
        exps[0] = 0;
        this.level = -1;
        for (int i = 1; i < exps.length; i++) {
            exps[i] = 30 * (i * i * i + 5 * i) - 80;
            if (exp >= exps[i - 1] && exp < exps[i]) {
                this.level = i - 1;
                break;
            }
        }
        if(this.level == -1){
            System.out.println("英雄经验值有误");
        }
    }
}
