package day25;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Integer> scoreList = new ArrayList<>();
        scoreList.add(1);
        scoreList.remove(0);


        Set<Integer> sets = new HashSet<>();

        sets.add(1);
        sets.add(2);
        sets.add(1);

        for (Integer i : sets) {
            System.out.println(i);
        }
        System.out.println(sets.size());


        Map<String,Integer> maps = new HashMap<>();
        maps.put("a",1);
        maps.put("ab",2);
        maps.put("a",2);

        for (Map.Entry<String, Integer> entry : maps.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }


        for (String key: maps.keySet()) {
            System.out.println(key);
            System.out.println(maps.get(key));
        }


    }
}
