package Demo03.Demo0324;

class Test032403 {
    final int i = 1;
    public static void main(String[] args) {
//        String
//        static 变量是表示这个变量属于 类
//               变量则表示这个变量属于 对象
        People people = new People();
        people.setKind("xiaoren");
        People.setKind("daren");
        System.out.println(people.kind);
        System.out.println(People.kind);

        People people2 = new People();
        System.out.println("----------");
        people2.setKind("ABC");
        System.out.println(people2.kind);
        System.out.println(people.kind);
        System.out.println(People.kind);
        System.out.println("----------");
        People.setKind("CCC");
        System.out.println(people.kind);
        System.out.println(people2.kind);
        System.out.println(People.kind);
    }
}
class People {
    static String kind;
    String name;
    public static void setKind(String kind) {
        People.kind = kind;
    }
}
