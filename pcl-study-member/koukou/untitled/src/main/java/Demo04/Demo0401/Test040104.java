package Demo04.Demo0401;

public class Test040104 {
    int salary;
    public void setSalary(int salary) throws DataValueException {
        if(salary<=2500){
            throw new DataValueException("薪资不能低于2500元");
        }else{
            this.salary = salary;
        }
    }
    public static void main(String[] args) {
        Test040104 test=new Test040104();
        try {
            test.setSalary(3000);
            System.out.println("薪资:" + test.salary);
        } catch (DataValueException e) {
            e.printStackTrace();
            System.out.println("薪资不能低于2500元");
        }
    }
}
class DataValueException extends Exception {
    public DataValueException() {
    }
    public DataValueException(String message) {
        super(message);
    }
    public DataValueException(Throwable cause) {
        super(cause);
    }
    public DataValueException(String message, Throwable cause) {
    }
}