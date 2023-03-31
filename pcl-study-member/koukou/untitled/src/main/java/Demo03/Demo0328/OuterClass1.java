package Demo03.Demo0328;

class OuterClass1 {
    private String name;
    private int age;
    public class InnerClass {
        private String name;
        private int age;
        public InnerClass(String name, int age) {
            this.name = name;
            this.age = age;

            OuterClass1.this.name = name;
            OuterClass1.this.age = age;
        }
        public void print() {
            System.out.println("name:" + name);
            System.out.println("age:" + age);
        }
    }

    public static void main(String[] args) {
        OuterClass1 outerClass = new OuterClass1();
        OuterClass1.InnerClass innerClass = outerClass.new InnerClass("koukou",29);
        innerClass.print();
    }
}
