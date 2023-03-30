package Day18;

public class OuterClass {

    private int age;

//    IFoo ifoo = new IFoo(){
//        public void display (){
//         System.out.printf("aaa");
//        }
//    };
    static IFoo ifo2o = () -> System.out.println("aaaa");

    public static void main(String[] args) {
        ifo2o.accept2();
    }
}
interface IFoo{

    void accept2();

}

