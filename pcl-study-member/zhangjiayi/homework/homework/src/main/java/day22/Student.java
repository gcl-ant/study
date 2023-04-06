package day22;

public class Student {
    private String studentId;
    private String name;
    private String className;
    private double [] grades;
    public Student(String studentId, String name, String className, double[] grades) {
        this.studentId = studentId;
        this.name = name;
        this.className = className;
        this.grades = grades;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double[] getGrades() {
        return grades;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    public double calculateAverageGrade() {
        double totalGrade = 0;
        for (double grade : grades) {
            totalGrade += grade;
        }
        return totalGrade / grades.length;
    }
}
