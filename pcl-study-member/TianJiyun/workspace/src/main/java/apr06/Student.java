package apr06;

public class Student {
    private int stuId;
    private String name;
    private char classNum;
    private double[] scores;

    public Student(int stuId, String name, char classNum) {
        this.stuId = stuId;
        this.name = name;
        this.classNum = classNum;
    }
    /*
    创建新的学生的时候无法得知学生的成绩以及科目数，所以构造器中不初始化，
    需要计算平均值的时候再将数组形式的成绩传入getAvgScore方法中。
     */
    public double getAvgScore(double[] scores){
        this.scores = scores;
        double sum = 0;
        for (int i = 0; i < this.scores.length; i++) {
            sum += sum + this.scores[i];
        }
        return sum / this.scores.length;
    }
}
