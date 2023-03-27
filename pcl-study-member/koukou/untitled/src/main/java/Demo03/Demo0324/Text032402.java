package Demo03.Demo0324;

public class Text032402 {
    public static void main(String[] args) {
        Car dakache = new DaKaChe();
        dakache.showType("a");
    }
}
abstract class Car {
    abstract void showType(String type);
}
class DaKaChe extends Car{
    @Override
    void showType(String type) {
        System.out.println("Dakache");
    }
}