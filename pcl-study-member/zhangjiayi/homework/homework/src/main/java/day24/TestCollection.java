package day24;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestCollection {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();


        stringList.add("aaa");
        stringList.add("bbb");
        stringList.add("ccc");
        stringList.add("aaa1");
        stringList.add("bbb2");

        for (String s1:stringList){
            System.out.println(s1);
        }
        System.out.println("--------------------------------------");
        for (String s1:linkedList){
            System.out.println(s1);
        }
        System.out.println("--------------------------------------");
        for (int i=0;i<stringList.size();i++){
            System.out.println(stringList.get(i));
        }
        System.out.println("--------------------------------------");
        for (int i=0;i<linkedList.size();i++){
            System.out.println(linkedList.get(i));
        }
//把stringList的第一个元素删除
        stringList.remove(1);
        for (int i=0;i<stringList.size();i++){
            System.out.println(stringList.get(i));
        }
        for (int i=0;i<linkedList.size();i++){
            System.out.println(linkedList.get(i));
        }
    }


}
