package Day23;

public class indexOf {
    public static void main(String[] args) {
        String word="i love china";
        System.out.println(word.indexOf("ch"));
        System.out.println(word.indexOf('i',0));
        System.out.println(word.indexOf("ch"));
        System.out.println(word.indexOf("ch",1));
        System.out.println(word.lastIndexOf('a'));
        System.out.println(word.lastIndexOf('h',2));
        System.out.println(word.lastIndexOf("ch"));
        System.out.println(word.lastIndexOf("ch",2));
        System.out.println(word.charAt(1));


    }

}
