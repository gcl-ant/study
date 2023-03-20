package Day09;

public class Bike {
    static final int staticInt = 10;
    int speed;

    void showSpeed() {
        System.out.println(this.speed);
    }

    void changeSpeed(int speed) {
        this.speed = speed;
    }

    static void print(){
        System.out.println(staticInt);
    }

    void changeAndShowSpeed(){
        changeSpeed(50);
        showSpeed();
    }

    void changeName(StringBuilder sbr){
        sbr.append("捷安特");
        sbr=new StringBuilder("凤凰牌");
        sbr.append("aaaaa");
        System.out.println("sbr"+sbr);
    }

    void changeName2(int age){
        age += 1;
        age = 100;
        age += 1;
        System.out.println("age"+age);//0
    }

    void print2(String... argg){
        System.out.println(argg[3]);
    }

    void print2(int... argg){
        System.out.println(argg[3]);
    }

    public static void main(String[] args) {
//        int speed30 = 30;
//        Bike bike = new Bike();
//        bike.showSpeed();
//        bike.changeSpeed(speed30);
//        bike.showSpeed();
//        bike.changeAndShowSpeed();
//        Bike.print();

//        StringBuilder stringBuilder = new StringBuilder("假凤凰牌");
//        Bike bike = new Bike();
//        bike.changeName(stringBuilder);
//        System.out.println(stringBuilder);

        int age = 10;
        Bike bike = new Bike();
//        bike.changeName2(age);
//        System.out.println(age);//10

        bike.print2("aaaa","bbb","cc");
        bike.print2(1,2,3);
    }
}
