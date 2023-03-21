package day11And12;

public class TestStaic {
    static {
        System.out.println("a");
    }
    static {
        System.out.println("b");
    }
    static {
        System.out.println("c");
    }

    public static void main(String[] args) {
        System.out.println("d");
    }
    static {
        System.out.println("e");
    }

}
