package Demo04.Demo0406;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getScore() < o2.getScore()) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Student s1 = new Student("A",80);
        Student s2 = new Student("B",80);
//        StudentComparator.compare(s1,s2);
    }
}
