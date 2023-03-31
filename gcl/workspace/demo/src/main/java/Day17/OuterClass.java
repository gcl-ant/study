package Day17;

class OuterClass {

    private String name;
    private int age;

    public class InnerClass {

        private String name;
        private int age;
        public InnerClass(String name, int age) {
            this.name = name;
            this.age = age;

            OuterClass.this.name = name;
            OuterClass.this.age = age;
        }

//        public void print() {
//            System.out.println("name1" + name1);
//            System.out.println("age1" + age1);
//        }
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass1 = outerClass.new InnerClass("小王",29);
//        innerClass1.print();

    }
}
