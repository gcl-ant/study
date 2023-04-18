package day25;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("11111");
        set.add("22222");
        set.add("33333");
        set.add("44444");
        set.add("55555");
        set.remove("11111");
        set.remove("22222");
        set.add("222222");
        System.out.println(set.size());
        for (String e: set){
            System.out.println(e);
        }

    }
}
