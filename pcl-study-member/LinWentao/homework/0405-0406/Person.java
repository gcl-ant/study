package D0405题目;

public class Person {
    private String name;
    private int age;
    private String gender;
    private double height;
    Person(String name, int age, String gender,double height) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void Personinfo() {
        System.out.println("Name: " +name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("height"+height);
    }


     /* Person Person1=new Person();
        Person1.setName("小明");
        Person1.setAge(25);x
        Person1.setGender("Male");
        Person1.setHeight(188.0);
        System.out.println("name:" + Person1.getName());
        System.out.println("age"+Person1.getAge());
        System.out.println("gender"+Person1.getGender());
        System.out.println("height"+Person1.getHeight());*/
    }







