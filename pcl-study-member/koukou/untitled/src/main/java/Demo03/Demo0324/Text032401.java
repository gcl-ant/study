package Demo03.Demo0324;

public class Text032401 {

    public static void main(String[] args) {
        Cat cat = null;
        for (int i = 0; i < 5; i += 2) {
            cat = new Cat();
            new Dog();
        }
        System.out.println(cat.age);
        System.out.println(Dog.age);
    }
}
class Cat {
    public int age;
    public Cat() {
        age++;
    }
}
class Dog {
    public static int age;
    public Dog() {
        age++;
    }
}


