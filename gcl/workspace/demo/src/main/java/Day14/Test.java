package Day14;

public class Test {
    final int i = 1;


    public static void main(String[] args) {
        Car car = new DaKaChe();
        car.showType("kache");
//        i=2;
//        String

        //static 变量是表示这个变量属于 类
        //       变量则表示这个变量属于 对象
        People people = new People();
        people.setKind("xiaoren");

        People.setKind("daren");

        System.out.println(people.kind);
        System.out.println(People.kind);

        People people2 = new People();
        System.out.println("--------------------------");
        people2.setKind("ABC");
        System.out.println(people2.kind); //ABC
        System.out.println(people.kind); //ABC
        System.out.println(People.kind); //ABC

        System.out.println("--------------------------");
        People.setKind("CCC");
        System.out.println(people.kind); //CCC
        System.out.println(people2.kind); //CCC
        System.out.println(People.kind); //CCC
        System.out.println(" window 不区分大小写的   Linux 是区分大小写");

    }
}
