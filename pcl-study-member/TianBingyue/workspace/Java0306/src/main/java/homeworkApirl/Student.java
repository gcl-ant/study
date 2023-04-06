package homeworkApirl;

public class Student extends Person{
    private String studentNo;
    private int Grade;

//    public Student() {
//    }

public Student(String studentNo) {
    this.studentNo = studentNo;
}

public String getStudentNo() {
        return studentNo;
    }
    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

public int getGrade() {
        return Grade;
    }
    public void setGrade(int Grade) {
        this.Grade = Grade;
    }

public static void main(String[] args) {

    Student stu1 = new Student("1111");
    stu1.setStudentNo("1111");
    stu1.setName("张三");
    stu1.setSex("男");
    stu1.setAge(21);
    stu1.setGrade(66);

    Student stu2 = new Student("2222");
    stu2.setStudentNo("2222");
    stu2.setName("李四");
    stu2.setSex("女");
    stu2.setAge(20);
    stu2.setGrade(76);

    Student stu3 = new Student("3333");
    stu3.setStudentNo("3333");
    stu3.setName("王五");
    stu3.setSex("男");
    stu3.setAge(21);
    stu3.setGrade(66);


    Student stu4 = new Student("4444");
    stu4.setStudentNo("4444");
    stu4.setName("赵六");
    stu4.setSex("女");
    stu4.setAge(20);
    stu4.setGrade(96);


    Student[] stus = new Student[5];
    stus[0] = stu1;
    stus[1] = stu2;
    stus[2] = stu3;
    stus[3] = stu4;

    int sum = 0;
    for (int i = 0; i <= 3; i++) {
        sum += stus[i].getGrade();
    }

//        System.out.println("平均成绩：" + (sum* 1.0 / 4));
//
//    System.out.println(stu1.getStudentNo());
//    System.out.println(stu1.getName());
//    System.out.println(stu1.getSex());
//    System.out.println(stu1.getAge());
//    System.out.println(stu2.getStudentNo());
//    System.out.println(stu2.getName());
//    System.out.println(stu2.getSex());
//    System.out.println(stu2.getAge());
//    stu1=null;
//    stu2=null;

    }

}


