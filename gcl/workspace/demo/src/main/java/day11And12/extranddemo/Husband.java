package day11And12.extranddemo;

public class Husband extends People{
    private Wife wife;

    @Override
    public void run() {
        System.out.println("用手run");
    }
    Husband(){
        super("aaaa");
        System.out.println("son");
//        super("aaaa");
    }
    public void drive(){
        System.out.println("drive");
    }
}
