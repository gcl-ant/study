package Demo04.Demo0404.Homework0404;

public class BankAccount {
    String name;
    int password;
    int oldmoney;
    int newmoney;
    public BankAccount(String name,int password){
        this.name = name;
        this.password = password;
    }
    public void putmoney(int password,int newmoney){
        if(this.password == password){
            this.newmoney = newmoney + oldmoney;
            this.oldmoney = this.newmoney;
        }
    }
    public void getmoney(int password,int oldmoney){
        if(this.password == password){
            this.newmoney = newmoney - oldmoney;
            this.oldmoney = this.newmoney;
        }
    }
}
class Ginnkou{
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("watashi",123456789);
        BankAccount bankAccount2 = new BankAccount("boku",987654321);

        bankAccount1.putmoney(123456789,1000);
        System.out.println(bankAccount1.newmoney);
        bankAccount1.putmoney(123456788,200);
        System.out.println(bankAccount1.newmoney);
        bankAccount1.putmoney(123456789,800);
        System.out.println(bankAccount1.newmoney);
        bankAccount1.getmoney(123456788,500);
        System.out.println(bankAccount1.newmoney);
        bankAccount1.getmoney(123456789,500);
        System.out.println(bankAccount1.newmoney);
    }
}