package homeworkApirl;

import java.util.Scanner;

public class BankAccount {
        String name="";
        String number="";
        int account=0;

public BankAccount(String name,int password){
            this.name = name;
            this.number = number;
            this.account = account;
        }

public void cqaccount(){
    System.out.println(this.name+this.number+"账户余额："+this.account);
}
public void ck(){
    System.out.println("存入金额：");
    Scanner sc = new Scanner(System.in);
    this.account += sc.nextInt();
    this.cqaccount();
}
public void qk(){
        System.out.println("取出金额：");
        Scanner sc = new Scanner(System.in);
        int qk = sc.nextInt();
        if(qk>this.account)
            qk = this.account;
        this.account -= qk;
        this.cqaccount();
}
public static void main(String[] args){
//    BankAccount a = new BankAccount("Tom", "1736",666999);
//    a.ck();
//    a.qk();
//    BankAccount b = new BankAccount("Marry","2048",999666);
//    a.ck();
//    a.qk();
}
}
