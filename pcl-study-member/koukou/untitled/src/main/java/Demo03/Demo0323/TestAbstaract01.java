package Demo03.Demo0323;

public abstract class TestAbstaract01 {
    public abstract void print();
}
abstract class TestAbstaract02 extends TestAbstaract01 {
}
class TestAbstaract03 extends TestAbstaract02 {
    @Override
    public void print() {
        System.out.println("xxxx");
    }

    public static void main(String[] args) {
//        TestAbstaract01 testAbstaract01 = new TestAbstaract01();
//        TestAbstaract02 testAbstaract02 = new TestAbstaract02();
        TestAbstaract01 testAbstaract03 = new TestAbstaract03();

        testAbstaract03.print();
    }
}
