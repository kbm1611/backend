package day07;

public class BankAccount {
    String accountNumber;
    String ownerName;
    int balance;

    BankAccount(){
        accountNumber = "";
        ownerName = "";
        balance = 0;
    }

    BankAccount(String an, String name, int b){
        accountNumber = an;
        ownerName = name;
        balance = b;
    }

    void deposit(int money){
        balance += money;
    }

    void withdraw(int money){
        if(money < balance){
            balance -= money;
        }else{
            System.out.println("출금액이 너무 큽니다.");
        }
    }
}
