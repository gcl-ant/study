package day07;

public class Test {
    public static void main(String[] args) {
        BigStudent tian = new BigStudent();
        System.out.println("大学生"+tian.name+"的年龄是:"+ tian.age);

        BigStudent tian2 = new BigStudent("田炳月",23);
        System.out.println("大学生"+tian2.name+"的年龄是:"+ tian2.age);

        tian2.name = "田氷玥";
        System.out.println("大学生2"+tian2.name+"的年龄是:"+ tian2.age);

        tian.drinkJiu();
        tian2.drinkJiu();

        String str11 =new String("av1");
        String str22 =new String("av1");

        String str33 ="av1";
        String st443 ="av1";

//        if (true){
//            str = "";
//            String str2 =  new String("aa");
//            str = str2;
//        }
//        System.out.println(str);

    }
}
