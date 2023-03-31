package Demo03.Demo0317;

public class Test031701 {
    //AttributeTest
    String name = "尻";
    int age =30;
    Float salary = 500000.0f;

//    public static void main(String[] args) {
//        Text031701 attributeTest = new Text031701();
//        attributeTest.age = 32;
//        attributeTest.salary = 510000.0f;
//        System.out.println(attributeTest.name);
//        System.out.println(attributeTest.age);
//        System.out.println(attributeTest.salary + "JPY");
//    }
    public String getName1(){
        return this.name;
    }
    public String getName2(String name){
        String a = name;
        return a;
    }
    public void setName(String name){
        this.name = name;
        System.out.println(this.name);
    }
        public static void main(String[] args) {
        Test031701 text031701 = new Test031701();
        System.out.println(text031701.getName1());
        System.out.println(text031701.getName2("尻尻"));
        text031701.setName("尻尻尻");
    }
}
