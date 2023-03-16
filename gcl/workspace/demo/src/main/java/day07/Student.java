package day07;

public class Student {


    static {
        System.out.println("Student class init");
    }
    {
        System.out.println("Student class 实例化");
    }
    //年龄
    int /*  纪录整数年龄*/ age;

    /**
     * 学生会吃饭
     */
    public void eat(){
        System.out.println("Student class 在吃饭");
    }

    /**
     * JAVA DOC
     * @param paramYear 传入的学习时长
     * @return 返回的学习时长
     */
    public int studyYear(int paramYear){
        System.out.println("Student class 学习时间");
        return paramYear;
    }

    public static void main(String[] args) {

    }

    /**
     * 构造方法  构造函数
     */
    public Student(){
        this.age = 6;
    }

    public Student(int age){
        this.age = age;
    }

    //内部类
    class InnerClass {

    }
}
