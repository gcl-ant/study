package day11And12;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("小刘",20,"1");
        System.out.println(student.age);
        System.out.println(student.name);
        System.out.println(student.sex.equals("1")?"男":"女");

        Racing kadirake = new Racing();
        kadirake.upgradeEngine();

        System.out.println(kadirake.topSpeed);

        List<String> strArr = Arrays.asList("am","b");
        strArr.stream().forEach(System.out::println);
    }
}
