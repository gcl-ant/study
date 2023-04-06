package Demo04.Demo0404.Homework0404;

public class Person {
    String name;
    int age;
    String sex;
    public Person(String name,int age,String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public void setPerson(String name){
        if (this.name == name){
            System.out.println("名前:" + name +
                    "\t" + "年齢:" + age +
                    "\t" + "性別:" + sex);
        }else {
            System.out.println("");
        }
    }
}
class Mibunnsyou{
    //身分証
    public static void main(String[] args) {
        Person person1 = new Person("AAA",20,"男");
        Person person2 = new Person("BBB",18,"女");

        person1.setPerson("AAA");
        person1.setPerson("CCC");
        person2.setPerson("BBB");
    }
}