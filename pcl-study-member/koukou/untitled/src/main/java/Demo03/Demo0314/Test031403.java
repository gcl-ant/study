package Demo03.Demo0314;

public class Test031403 {
//    public static void main(String[] args) {
//        Text031402 a = new Text031402();
////        System.out.println(text031401.age);
//    }
    public Test031403() {
    }
    public static void main(String[] args) {
        Test031402 tian = new Test031402();
        System.out.println("大學生" + tian.name + "的年龄是:" + tian.age);
//        Text031401 aa = new Text031401(24);
//        System.out.println("年龄是:" + tian.age);
        Test031402 tian2 = new Test031402("田炳月", 23);
        System.out.println("大學生" + tian2.name + "的年龄是:" + tian2.age);
        tian2.name = "田氷玥";
        System.out.println("大學生2" + tian2.name + "的年龄是:" + tian2.age);
        tian.drinkJiu();
        tian2.drinkJiu();
    }
}
