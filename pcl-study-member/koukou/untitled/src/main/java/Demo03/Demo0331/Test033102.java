package Demo03.Demo0331;

public class Test033102 {
    String firstname,lastname;
    Test033102(String firstname,String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }
    public static void main(String[] args) {
        Person person = Test033102::new;
        Test033102 test = person.create("A","B");
        System.out.println(
                "Firstname:" + test.firstname +
                " Lastname:" + test.lastname
        );
    }
}
interface Person{
    Test033102 create(String firstname,String lastname);
}