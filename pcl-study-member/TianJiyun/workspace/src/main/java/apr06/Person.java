package apr06;

public class Person {
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "个人信息为:" +
                "姓名：'" + name + '\'' +
                ", 年龄：" + age +
                ", 性别：" + gender +
                '}';
    }
}
