package Day14;

public class Test2 {

    static final String HEALTH_NAME = "";
    final static String HEALTH_NAME2= "";

    public static void main(String[] args) {
        Cat cat = null;
        //0 1 2 3 4 5次
        // 0  2  4  6x  3次
        for (int i = 0; i < 5; i += 2) {
            cat = new Cat();
            new Dog();
        }
        // 2     2   1  +2  1
        System.out.println(cat.age);
        // 10    3   5      3
        System.out.println(Dog.age);
    }
}

class Cat {
    // 0   0    0    0     0
    public int age;

    //1    1    1    1     1
    public Cat() {
        age++;
    }
}

class Dog {

    //0    1     2    3     4
    public static int age;

    // 1   2     3    4     5
    public Dog() {
        age++;
    }
}


