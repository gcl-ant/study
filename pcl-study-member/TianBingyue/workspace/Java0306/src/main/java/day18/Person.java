package day18;

public class Person {
    String firstName;
    String lastName;
    Person(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public static void main(String[] args){
        PersonFactory PersonFactory = Person::new;
        Person person = PersonFactory.create("Jack","Zhou");
        System.out.println(person.firstName + "\t" + person.lastName);
    }
}
interface PersonFactory{
    Person create(String firstName,String lastName);
}