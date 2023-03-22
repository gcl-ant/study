package Demo03.Demo0321;

public class Text032102 {
    public static void main(String[] args) {
        Text032101 student = new Text032101("kousan",20,"1");
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.sex.equals("1")?"男":"女");
    }
}
