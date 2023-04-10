package Demo04.Demo0404.Homework0404;

public class Student {
    String name;
    int studentclass;
    int studentnumber;
    int score;
    public Student(String name,int studentclass,int studentnumber){
        this.name = name;
        this.studentclass = studentclass;
        this.studentnumber = studentnumber;
    }
    public int getTextScore(int japanese,int math,int english){
        this.score = (japanese+math+english)/3;
        System.out.println(this.score);
        return this.score;
    }
//    public void getScore(int[] score){
//    }
//    public void classAverage(int studentclass){
//        if (this.studentclass == studentclass){
//            System.out.println(this.studentclass);
////            for (studentnumber=1;studentnumber<=3;studentnumber++){
////                int a = score + score;
////            }
//        }
//    }
}
class TextScore{
    public static void main(String[] args) {
        Student student1 = new Student("AAA",301,1);
        Student student2 = new Student("BBB",301,2);
        Student student3 = new Student("CCC",301,3);
//        Student student4 = new Student("DDD",302,1,90);
//        Student student5 = new Student("EEE",302,2,75);
//        Student student6 = new Student("FFF",302,3,60);
//        Student student7 = new Student("GGG",303,1,95);
//        Student student8 = new Student("HHH",303,2,85);
//        Student student9 = new Student("III",303,3,75);
        student1.getTextScore(50,60,70);
//        student1.getScore(new int[]{60, 70, 80});
    }
}