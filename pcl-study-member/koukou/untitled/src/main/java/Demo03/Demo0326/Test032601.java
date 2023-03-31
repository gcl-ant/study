package Demo03.Demo0326;

public class Test032601 { //Vehicle
    // "Vehicle" 是英语单词，意思是指任何能够运输人或物品的机械设备或交通工具，例如汽车、卡车、摩托车、自行车、火车、飞机、船只等
    private boolean isStart = false;
    public void start(){
        this.isStart = true;
    }
    public void stop(){
        this.isStart = false;
    }

    public static void main(String[] args) {
        Tank specialTank = new SpecialTank();
        specialTank.attract();
        System.out.println(specialTank.ATTRACT_SPEED_FAST);
        System.out.println(specialTank.ATTRACT_SPEED_SLOW);
    }
}
abstract class Tank implements Weapon {
    public abstract void attract();
}
class SpecialTank extends Tank{
    @Override
    public void attract(){
        System.out.println("AAA");
    }
}
interface Weapon {
    int ATTRACT_SPEED_FAST = 200;
    int ATTRACT_SPEED_SLOW = 50;
    void attract();
}