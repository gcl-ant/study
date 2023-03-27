package Demo03.Demo0321;

//import java.util.Arrays;
//import java.util.List;

public class Text032104 {
    public static void main(String[] args) {

        Racing kadirake = new Racing();
        kadirake.upgradeEngine();
        System.out.println(kadirake.topSpeed);

//        List<String> strArr = Arrays.asList("am","b");
//        strArr.stream().forEach(System.out::println);
    }
}
    class Racing {
        int topSpeed = 100;
        Racing racing;
        void upgradeEngine() {
            RepairFactory repairFactory = new RepairFactory();
            repairFactory.repairEngine(this);

            Racing honda = new Racing();
//            repairFactory.repairEngine(honda);
            honda.topSpeed = 150;
            System.out.println(honda.topSpeed);
        }
    }
    class RepairFactory {
        void repairEngine(Racing racing){
            racing.topSpeed = 200;
        }
    }