package Demo04.Demo0407;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Test0407 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        List<String> linkedlist = new LinkedList<>();

        stringList.add("A");
        stringList.add("B");
        stringList.add("C");
        linkedlist.add("D");
        linkedlist.add("E");
        linkedlist.add("F");

        for(String s1:stringList){
            System.out.println(s1);
        }
        for(String s1:linkedlist){
            System.out.println(s1);
        }
        stringList.remove(1);
        for(int i=0;i<stringList.size();i++){
            System.out.println(stringList.get(i));
        }
        for(int i=0;i<linkedlist.size();i++){
            System.out.println(linkedlist.get(i));
        }
    }
}
