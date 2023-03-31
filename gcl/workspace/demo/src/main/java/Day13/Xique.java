package Day13;

public class Xique extends Bird {
    int age = 20;

    // 重写
    @Override
    public void printAge(){
        System.out.println("print Age :" + this.age);
    }
}
