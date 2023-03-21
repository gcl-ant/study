package Day11And12;

public class Racing {
    int  topSpeed = 100;
    Racing racing;

    void upgradeEngine(){
        RepairFactory repairFactory = new RepairFactory();
        repairFactory.repairEngine(this);

        Racing honda = new Racing();
        repairFactory.repairEngine(honda);
        honda.topSpeed = 150;
    }


}
