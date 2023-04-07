package D0405题目;

public class Student {
    private String studentid;
    private String name;
    private double[] grades;

    public Student(String id, String name, String className, double[] grades) {
        this.studentid = studentid;
        this.name = name;
        this.grades = grades;

    }
    public String getName() {
        return name;
    }

    public String getStudentid() {
        return studentid;
    }

    public double[] getGrades() {
        return grades;
    }

    public double getAverageGrade() {
        double gradesum = 0;
        for (double grade : grades) {
            gradesum += grade;
        }
        return gradesum / grades.length;
    }
}