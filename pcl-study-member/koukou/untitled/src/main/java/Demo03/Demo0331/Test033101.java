package Demo03.Demo0331;

public class Test033101 {
    public void foo(){
        System.out.println("ABC");
    }
    public static void main(String[] args) {
        Test033101 test0331 = new Test033101();
        IBFoo ibfoo = test0331::foo;
        ibfoo.ifoo();
    }
}
interface  IBFoo{
    public void ifoo();
}