package day11And12;

public class StaticDemo {
    static {
        System.out.println("aaaaa");
    }
    {
        System.out.println("bbbb");

        System.out.println("ccc");
    }

    public static void main(String[] args) {
        StaticDemo staticDemo = new StaticDemo();
        StaticDemo staticDemo2= new StaticDemo();

        System.out.println();
    }
}
