package Demo04.Demo0410;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test0410 <T> {
    private T t;
    public T getT() {
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }
    public static void main(String[] args) {
        Test0410<String> i = new Test0410<>();
        i.setT(new String("A"));
        System.out.println(i.getT());

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String str = it.next();
            if(str.equals("A")){
                it.remove();
            }
            System.out.println(str);
        }
        System.out.println("-----");
        for(String str:list){
            System.out.println(str);
        }
    }
}