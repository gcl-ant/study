package Demo04.Demo0404.Homework0404;

public class Person {
    private String name;
    private int age;
    private char sex;
    private int idNum;
    public Person(String name,int age,char sex,int idNum){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.idNum = idNum;
    }
    public String getName(int idNum) {
        if (this.idNum == idNum){
            System.out.println(name);
            return name;
        } return null;
    }
    public int getAge(int idNum) {
        if (this.idNum == idNum){
            System.out.println(age);
            return age;
        } return 0;
    }
    public char getSex(int idNum) {
        if (this.idNum == idNum){
            System.out.println(sex);
            return sex;
        } return 0;
    }
}
class IdNumber{
    //身分証
    public static void main(String[] args) {
        Person person1 = new Person("AAA",20,'男',20230401);
        Person person2 = new Person("BBB",18,'女',20230402);

        person1.getName(20230401);
        person1.getName(20230402);
        person1.getAge(20230401);
        person2.getSex(20230402);
    }
}