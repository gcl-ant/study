package day09;

public class AttributeTest {
    // public private  protected
    String name = "山崎";
    int age =30;
    Float salary = 500000.0f;

    public static void main(String[] args) {
        AttributeTest attributeTest = new AttributeTest();
        attributeTest.age = 32;
        attributeTest.salary = 510000.0f;
        System.out.println(attributeTest.name);
        System.out.println(attributeTest.age);
        System.out.println(attributeTest.salary + "JPY");
    }

    public String getName(){
        return this.name;
//        public String getName(){
//
//        }
    }
    public String getName(String name){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}
