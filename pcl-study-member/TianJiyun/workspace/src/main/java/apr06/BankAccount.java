package apr06;

public class BankAccount {
    private String id;
    private double balance;

    public BankAccount(String id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double money){
        balance += money;
    }
    public void withdrawals(double money){
        balance -= money;
    }

}
