package day22;

import Day16.C;

import java.util.Objects;

public class Course implements  Cloneable{
    private String name;

    private int point;

    public Course(String name, int point) {
        this.name = name;
        this.point = point;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return point == course.point && Objects.equals(name, course.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, point);
    }

//    @Override
//    public String toString() {
//        return "Course{" +
//                "name='" + name + '\'' +
//                ", point=" + point +
//                '}';
//    }


    public void setName(String name) {
        this.name = name;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public int getPoint() {
        return point;
    }

    public static void main(String[] args) {
        Course course1 = new Course("JAVA1", 100);
        Course course2 = new Course("JAVA", 100);
//        System.out.println(course2.equals(course1));
        System.out.println(course1);

        try {
//            Course course3 = course2.clone();
//            System.out.println(course3);
//            System.out.println(course2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Course clone() {
        try {
            Course clone = (Course) super.clone();
            clone.setName(new String(clone.getName()));
            clone.setPoint(new Integer(clone.getPoint()));
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
