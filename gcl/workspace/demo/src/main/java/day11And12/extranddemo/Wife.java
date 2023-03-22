package day11And12.extranddemo;

public class Wife extends People {
    private Husband husband;

    public Wife(String name, Husband husband) {
        super(name);
        this.husband = husband;
    }

    public void cook() {
        System.out.println("Cook");
    }
}
