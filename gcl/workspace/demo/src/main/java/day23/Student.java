package day23;

public class Student {

    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

//    @Override
//    public int compareTo(Student s1) {
//        if (s1.getScore() > this.score) {
//            return 1;
//        }
//        return 0;
//    }
}
