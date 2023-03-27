package Demo03.Demo0321;

public class Text032102 {
//    static {
//        System.out.println("a");
//    }
//    static {
//        System.out.println("b");
//    }
//    static {
//        System.out.println("c");
//    }
//    {
//        System.out.println("eee");
//    }
//    public static void main(String[] args) {
//        Text032102 staticDemo = new Text032102();
//        Text032102 staticDemo2= new Text032102();
//        Text032102 staticDemo3= new Text032102();
//        System.out.println();
//    }
//    static {
//        System.out.println("d");
//    }
    int i = 0;
    Text032102 increment(){
        this.i += 2;
        return this;
    }
    void print(){
        System.out.println("i="+i);
    }
    public static void main(String[] args) {
        Text032102 x = new Text032102();
        x.increment();
        x.increment().increment().increment().increment().increment().print();
    }
}
