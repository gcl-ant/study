package Demo03.Demo0321;

public class Test032101 {
    String name;
    int age;
    String sex;

//    Text032101(){
//        //無參構造函數
//    }
    Test032101(String name, int age, String sex){
        //有參構造函數
        this.name=name;
        this.age=age;
        this.sex=sex;
    }
//    Text032101(String name,int age) {
//        this.name = name;
//        this.age = age;
//    }
//    Text032101(String name,int age,String sex) {
//        this(name,age);
//        this.sex = sex;
//    }
    public static void main(String[] args) {
        Test032101 student = new Test032101("kousan",20,"1");
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.sex.equals("1")?"男":"女");
    }
}
