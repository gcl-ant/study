package Day15;

/**
 * "Vehicle" 是英语单词，意思是指任何能够运输人或物品的机械设备或交通工具，例如汽车、卡车、摩托车、自行车、火车、飞机、船只等
 */
public class Vehicle {

    private boolean isStart = false;
    public void start(){
        this.isStart = true;
    }

    public void stop(){
        this.isStart = false;
    }
}
