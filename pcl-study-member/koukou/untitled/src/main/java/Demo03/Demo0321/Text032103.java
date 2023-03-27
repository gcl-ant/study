package Demo03.Demo0321;

public class Text032103 {
    public static void main(String[] args) {
        Husband koukou1 = new Husband();
        Wife koukou2 = new Wife("bbb",koukou1);

        koukou1.drive();
        koukou1.run();
        System.out.println(koukou2.husband);
        koukou2.cook();
        koukou2.run();
    }
}
    class People{
        String name,sex;
        int age;
        People(){
            System.out.println("father");
        }
        People(String name){
            System.out.println(name);
        }
        public void run() {
            System.out.println("run");
        }
    }
    class Husband extends People {
        Wife wife;
        @Override
        public void run() {
            System.out.println("用手run");
        }
        Husband() {
            super("aaa");
            System.out.println("Son");
        }
        public void drive() {
            System.out.println("Drive");
        }
    }
    class Wife extends People {
        Husband husband;
        public Wife(String name,Husband husband) {
            super(name);
            this.husband = husband;
        }
        public void cook() {
            System.out.println("Cook");
        }
    }
