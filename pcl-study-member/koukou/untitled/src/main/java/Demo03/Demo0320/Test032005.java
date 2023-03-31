package Demo03.Demo0320;

public class Test032005 {
    public static void main(String[] args) {
        Animal animal = new Dog(); // animal為Dog的實例
        animal.run(5);
    }
}
class Animal {
    public void run(int units) {
        System.out.println("動物移動" + units + "步");
    }
}
class Dog extends Animal {
    @Override
    public void run(int units){
        System.out.println("狗狗跑" + units + "步");
    }
}
