package day25;

public class ArrayList<S> {
    public static void main(String[] args) {
        java.util.ArrayList<String> list = new java.util.ArrayList<String>();

        list.add("11111");
        list.add("22222");
        list.add("33333");
        list.add("44444");
        list.add("55555");
        list.remove("11111");
        list.remove("22222");
        list.set(0,"333333");



        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }



    }



}
