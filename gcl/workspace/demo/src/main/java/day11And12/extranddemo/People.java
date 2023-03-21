package day11And12.extranddemo;

public class People {

    protected String name;
    protected String sex;
    protected int age;

    private People(){
        System.out.println("father");
    }

    People(String name){
        System.out.println(name);
    }
    protected void run() {
        System.out.println("run");
    }
}
