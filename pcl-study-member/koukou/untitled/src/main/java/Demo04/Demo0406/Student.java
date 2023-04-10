package Demo04.Demo0406;

public class Student {
    private String name;
    private int score;
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }
//    @Override
//    public static int compare(Student o1, Student o2) {
//        if (o1.getScore() < o2.getScore()) {
//            return 1;
//        }
//        return 0;
//    }
//    public static void main(String[] args) {
//        Student s1 = new Student("A",80);
//        Student s2 = new Student("B",80);
//        System.out.println(Student.compare(s1,s2));
//    }
}
