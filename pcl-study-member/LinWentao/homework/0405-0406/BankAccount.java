package D0405题目;

import org.omg.CORBA.PUBLIC_MEMBER;

public class BankAccount {
        private String name;
        private double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getname() {
        return name;
    }
    public double getBalance() {
        return balance;
    }

    public void deposit(double sum){
        balance += sum;
    }
    public void withdraw(double sum){
       if(balance>=sum) {
           balance -= sum;
       }else {
           System.out.println("没钱就别取啦");
       }
    }

}
