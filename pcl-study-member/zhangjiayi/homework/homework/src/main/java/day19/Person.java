package day19;

public class Person {
    String firstName;
    String lastName;
    Person(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static void main(String[] args) {
        PersonFactory personFactory = Person::new;
        Person person = personFactory.create("Jiayi","Zhang");
        System.out.println(person.firstName+"\t"+person.lastName);
    }
}

