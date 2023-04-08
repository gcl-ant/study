package day25;

public class Student {
    private int id;
    private String name;
    private String className;
    private double[] scores;

    public Student(int id, String name, String className, double[] scores) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.scores = scores;
    }

    public double getAverageScore() {
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }
}
