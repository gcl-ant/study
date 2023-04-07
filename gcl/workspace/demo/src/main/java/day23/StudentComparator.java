package day23;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getScore() < o2.getScore()) {
            return 1;
        }
        return 0;
    }
}
