package day24;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestCollection {
    public static void main(String[] args){
        List<String> stringList = new ArrayList<>();
        List<String> LinkedList = new LinkedList<>();

        stringList.add("aaa");
        stringList.add("bbb");
        stringList.add("ccc");
        stringList.add("ddd");
        stringList.add("aa1");
        stringList.add("bb2");

        for (String s1:stringList){
            System.out.println(s1);
        }

        for (String s1:LinkedList) {
            System.out.println(s1);
        }

        stringList.remove(1);
        for (int i = 0;i<stringList.size();i++){
            System.out.println(stringList.get(i));
        }

        for (int i = 0;i<LinkedList.size();i++){
            System.out.println(LinkedList.get(i));
        }
    }
}
