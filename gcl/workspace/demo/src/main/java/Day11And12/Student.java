package Day11And12;

public class Student {

    String name;

    int age;

    // 1 -- 男
    //０　女
    String sex;

    /**
     * 无参数的构造函数
     */
    Student() {

    }

    Student(String name) {
        this.name = name;
    }

    Student(int age) {
        this.age = age;
    }

    Student(String name,int age) {
        this.name = name;
        this.age = age;
    }

    Student(String name,int age,String sex) {
        this(name,age);
        this.sex = sex;
    }
}
