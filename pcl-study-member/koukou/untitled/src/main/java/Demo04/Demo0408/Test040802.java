package Demo04.Demo0408;

import java.io.*;

public class Test040802 {
    public static void main(String[] args) {
        Person person = new Person("A");
        try{
            FileOutputStream fos = new FileOutputStream("./PersonName.txt",true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(person);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        try {
            FileInputStream fis = new FileInputStream("PersonName.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Person ps = (Person) ois.readObject();
            System.out.println(ps.name);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
class Person implements Serializable{
    String name;
    public Person(String name){
        this.name = name;
    }
}