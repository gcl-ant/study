package Demo04.Demo0404;

import java.io.*;

public class Test040404 {
    public static void main(String[] args) throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        Person person = new Person("尻",25);
        oos.writeObject(person);
        byte[] b = baos.toByteArray();

        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(b));
        Person ps = (Person) ois.readObject();
        System.out.println(ps.name);
        System.out.println(ps.age1);
        System.out.println(ps.age2);
    }
}
class Person implements Serializable{
    String name;
    int age1;
    transient int age2;
    Person(String name,int age){
        this.name = name;
        this.age1 = age;
        this.age2 = age;
    }
}